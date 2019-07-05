package cn.edu.imnu.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class count {
	
	public count() {
    }
    /**
     * 读取某个文件夹下的所有文件
     */
    public static boolean count1(String filepath) throws FileNotFoundException, IOException {
            try {

                    File file = new File(filepath);
                    if (!file.isDirectory()) {
                            System.out.println("文件");
                            System.out.println("path=" + file.getPath());
                            System.out.println("absolutepath=" + file.getAbsolutePath());
                            System.out.println("name=" + file.getName());

                    } else if (file.isDirectory()) {
//                            System.out.println("文件夹");
                            String[] filelist = file.list();
                            for (int i = 0; i < filelist.length; i++) {
                                    File readfile = new File(filepath + "\\" + filelist[i]);
                                    if (!readfile.isDirectory()) {
//                                            System.out.println("path=" + readfile.getPath());
//                                            System.out.println("absolutepath="+ readfile.getAbsolutePath());
                                    	File oldname = new File("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload\\"+readfile.getName());
//                                    	System.out.println(readfile.getName());
                                    	File newname = new File("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload\\"+i+".jpg");
                                    	if(oldname.renameTo(newname)) {
//                                            System.out.println("已重命名");
                                        } else {
                                            System.out.println("Error");
                                        }
//                                        System.out.println("name=" + readfile.getName());

                                    } else if (readfile.isDirectory()) {
                                            count1(filepath + "\\" + filelist[i]);
                                    }
                            }

                    }

            } catch (FileNotFoundException e) {
                    System.out.println("readfile()   Exception:" + e.getMessage());
            }
            return true;
    }

/**
     * 删除某个文件夹下的所有文件夹和文件
     */
    
    
    public static boolean deletefile(String delpath)
                    throws FileNotFoundException, IOException {
            try {

                    File file = new File(delpath);
                    if (!file.isDirectory()) {
                            System.out.println("1");
                            file.delete();
                    } else if (file.isDirectory()) {
//                            System.out.println("2");
                            String[] filelist = file.list();
                            for (int i = 0; i < filelist.length; i++) {
                                    File delfile = new File(delpath + "\\" + filelist[i]);
                                    if (!delfile.isDirectory()) {
//                                            System.out.println("path=" + delfile.getPath());
//                                            System.out.println("absolutepath="
//                                                            + delfile.getAbsolutePath());
//                                            System.out.println("name=" + delfile.getName());
                                            delfile.delete();
//                                            System.out.println("删除文件成功");
                                    } else if (delfile.isDirectory()) {
                                            deletefile(delpath + "\\" + filelist[i]);
                                    }
                            }
                            file.delete();

                    }

            } catch (FileNotFoundException e) {
                    System.out.println("deletefile()   Exception:" + e.getMessage());
            }
            return true;
    }
    
    public static void main(String[] args) {
            try {
                    count1("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core"
                    		+ "\\tmp0\\wtpwebapps\\photo\\upload");
                    //deletefile("D:\\eclipse\\新建文件夹\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\photo\\upload");
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            }
//            System.out.println("ok");
    }

}
