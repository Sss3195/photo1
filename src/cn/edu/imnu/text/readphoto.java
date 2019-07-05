package cn.edu.imnu.text;

import java.io.File;  
import com.drew.imaging.ImageMetadataReader;  
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;  

public class readphoto {
	public static void main(String[] args) throws Exception, Exception{
		String path="D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload";
		count c=new count();
		c.count1("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload");
		File file1 = new File("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload");
		String[] filelist = file1.list();
		for (int i = 0; i < filelist.length; i++) {
			File file = new File("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload\\"+i+".jpg");
			printImageTags(file);
			}
		//c.deletefile(path);
	}
	public static void printImageTags(File file) throws ImageProcessingException, Exception{  
		Metadata metadata = ImageMetadataReader.readMetadata(file);
		for (Directory directory : metadata.getDirectories()) { 
			for (Tag tag : directory.getTags()) {
				String tagName = tag.getTagName();  //标签名
				String desc = tag.getDescription(); //标签信息
//				if (tagName.equals("Image Height")) {  
//					System.out.println("图片高度: "+desc);
//				} else if (tagName.equals("Image Width")) {  
//					System.out.println("图片宽度: "+desc);
//				} else if (tagName.equals("Date/Time Original")) {  
//					System.out.println("拍摄时间: "+desc);
//				}else 
				number nu=new number();
				if (tagName.equals("GPS Latitude")) {  
					nu.setWD(pointToLatlong (desc));
					System.err.println("纬度 : "+pointToLatlong (desc));
				} else if (tagName.equals("GPS Longitude")) {  
					nu.setJD(pointToLatlong (desc));
					System.err.println("经度: "+pointToLatlong (desc)); 
				}
			}
		}
	}
	public static String pointToLatlong (String point ) {  
		Double du = Double.parseDouble(point.substring(0, point.indexOf("°")).trim());  
		Double fen = Double.parseDouble(point.substring(point.indexOf("°")+1, point.indexOf("'")).trim());  
		Double miao = Double.parseDouble(point.substring(point.indexOf("'")+1, point.indexOf("\"")).trim());  
		Double duStr = du + fen / 60 + miao / 60 / 60 ;  
		return duStr.toString();  
	}  
}
