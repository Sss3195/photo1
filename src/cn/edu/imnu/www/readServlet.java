package cn.edu.imnu.www;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;  
import com.drew.imaging.ImageMetadataReader;  
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import cn.edu.imnu.text.count;
import cn.edu.imnu.text.number;

/**
 * Servlet implementation class readServlet
 */
@WebServlet("/readServlet")
public class readServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static int x1,y1;
    public static int x2,y2;
    public static int x3,y3;
    public static int x4,y4;
    public static int x5,y5;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public readServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    number nu=new number();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path="D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload";
		count c=new count();
		c.count1("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload");
		File file1 = new File("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload");
		String[] filelist = file1.list();
		File file=null;
		for (int i = 0; i < filelist.length; i++) {
			file = new File("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload\\"+i+".jpg");
			}
		//c.deletefile(path);
		//File file = new File("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload\\0.jpg");
		Metadata metadata;
		try {
			metadata = ImageMetadataReader.readMetadata(file);
			
			for (Directory directory : metadata.getDirectories()) { 
				for (Tag tag : directory.getTags()) {
					String tagName = tag.getTagName();  //标签名
					String desc = tag.getDescription(); //标签信息
//					if (tagName.equals("Image Height")) {  
//						System.out.println("图片高度: "+desc);
//					} else if (tagName.equals("Image Width")) {  
//						System.out.println("图片宽度: "+desc);
//					} else if (tagName.equals("Date/Time Original")) {  
//						System.out.println("拍摄时间: "+desc);
//					}
					if (tagName.equals("GPS Latitude")) {  
						nu.setWD(pointToLatlong1 (desc));;
//						System.out.println("纬度 : "+pointToLatlong1 (desc));
					} else if (tagName.equals("GPS Longitude")) {  
						nu.setJD(pointToLatlong1 (desc));
//						System.out.println("经度: "+pointToLatlong1 (desc)); 
					}
				}
			}
			String data=UploadServlet.count;
			System.out.println(data);
			double d=Double.valueOf(data);
			if(d==1) {
				y1=(int)(Double.valueOf(nu.WD)*1000000)%100+300;
				x1=(int)(Double.valueOf(nu.JD)*1000000)%100+500;
				System.out.println(x1);
				System.out.println(y1);
			}
			if(d==2) {
				y2=(int)(Double.valueOf(nu.WD)*1000000)%100+300;
				x2=(int)(Double.valueOf(nu.JD)*1000000)%100+500;
				System.out.println(x2);
				System.out.println(y2);
			}
			if(d==3) {
				y3=(int)(Double.valueOf(nu.WD)*1000000)%100+300;
				x3=(int)(Double.valueOf(nu.JD)*1000000)%100+500;
				System.out.println(x3);
				System.out.println(y3);
			}
			if(d==4) {
				y4=(int)(Double.valueOf(nu.WD)*1000000)%100+300;
				x4=(int)(Double.valueOf(nu.JD)*1000000)%100+500;
				System.out.println(x3);
				System.out.println(y3);
			}
		} catch (ImageProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.deletefile(path);
		response.sendRedirect("upload.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public static String pointToLatlong1 (String point ) {  
		Double du = Double.parseDouble(point.substring(0, point.indexOf("°")).trim());  
		Double fen = Double.parseDouble(point.substring(point.indexOf("°")+1, point.indexOf("'")).trim());  
		Double miao = Double.parseDouble(point.substring(point.indexOf("'")+1, point.indexOf("\"")).trim());  
		Double duStr = du + fen / 60 + miao / 60 / 60 ;  
		return duStr.toString();  
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

