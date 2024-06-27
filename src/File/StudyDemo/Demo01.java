package File.StudyDemo;

import java.io.File;

/**
 * @Author
 * @Date 2024/6/27 23:40
 * @Description:
 */
public class Demo01 {

    public static void main(String[] args) {

        /**
         *  public  boolean  isDirectory()          判断此路径名表示的file是否为文件夹
         *  public  boolean  isFile()               判断此路径名表示的file是否为文件
         *  public  boolean  exists()               判断此路径名表示的file是否存在
         */

        System.out.println("========================================================");

        // 1. 对一个文件的路径进行判断
        String path1 = "C:\\Users\\Naruto\\Desktop\\logo.png";
        File f1 = new File(path1);
        System.out.println("学习一，路径为：" + path1);
        System.out.println("是否为文件夹：" + f1.isDirectory());
        System.out.println("是否为文件：" + f1.isFile());
        System.out.println("是否存在：" + f1.exists());

        System.out.println("========================================================");

        // 2. 对一个文件夹的路径进行判断
        String path2 = "C:\\Users\\Naruto\\Desktop\\logo";
        File f2 = new File(path2);
        System.out.println("学习二，路径为：" + path2);
        System.out.println("是否为文件夹：" + f2.isDirectory());
        System.out.println("是否为文件：" + f2.isFile());
        System.out.println("是否存在：" + f2.exists());

        System.out.println("========================================================");

        // 3. 对一个不存在的路径进行判断
        String path3 = "C:\\Users\\Naruto\\Desktop\\logo666";
        File f3 = new File(path3);
        System.out.println("学习三，路径为：" + path3);
        System.out.println("是否为文件夹：" + f3.isDirectory());
        System.out.println("是否为文件：" + f3.isFile());
        System.out.println("是否存在：" + f3.exists());

        System.out.println("========================================================");
    }
}
