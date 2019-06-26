package cn.edu.imnu.text;
import java.io.File;
import java.io.IOException;
public class rename {
	public static void main(String[] args) throws IOException  {   
		File oldFile = new File("E:\\upload");
		if(!oldFile.exists())  {
			oldFile.createNewFile(); 
	    }
		System.out.println("修改前文件名称是："+oldFile.getName());  
		String rootPath = oldFile.getParent();  
		System.out.println("根路径是："+rootPath);  
		File newFile = new File(rootPath + File.separator + "2.jpg");  
		System.out.println("修改后文件名称是："+newFile.getName());
		if (oldFile.renameTo(newFile)) {
			System.out.println("修改成功!");
		}  else {
			System.out.println("修改失败");
		}
	}
}
