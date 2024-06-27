package File.StudyDemo;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;

/**
 * @Author
 * @Date 2024/6/27 23:51
 * @Description:
 */
public abstract class Demo02 {


    public static void main(String[] args) {

        /**
         public long  length()                返回文件的大小（字节数量）
         public String  getAbsolutePath()     返回文件的绝对路径
         public String  getPath()             返回定义文件时使用的路径
         public String  getName()             获取文件的名称，带后缀
         public long  lastModified()          返回文件的最后修改时间（时间毫秒值）
         */

        System.out.println("========================================================================================");

        // 1. length()  返回文件的大小（字节数量）
        // 细节1：这个方法只能读取文件的大小，单位是字节
        // 如果单位我们要是M，G，可以不断除以1024
        // 细节2：这个方法无法获取文件夹的大小
        // 如果我们要获取一个文件夹的大小，需要把这个文件夹中的文件大小都累加在一起

        System.out.println("学习路径为：D:\\WorkSpace\\JavaSE\\src\\File\\文件知识点总结.md");
        File file1 = new File("D:\\WorkSpace\\JavaSE\\src\\File\\文件知识点总结.md");
        System.out.println("文件大小（字节数量）：" + file1.length());  // 1736

        File file2 = new File("D:\\WorkSpace\\JavaSE\\src\\File");
        System.out.println("文件夹大小：" + file2.length());  // 0

        // 2. getAbsolutePath()  返回文件的绝对路径
        File file3 = new File("D:\\WorkSpace\\JavaSE\\src\\File\\文件知识点总结.md");
        System.out.println("文件的绝对路径：" + file3.getAbsolutePath());

        File file4 = new File("src\\File\\文件知识点总结.md");
        System.out.println("文件的绝对路径：" + file4.getAbsolutePath());


        // 3. getPath()  返回定义文件时使用的路径
        System.out.println("定义文件时使用的路径：" + file3.getPath());
        System.out.println("定义文件时使用的路径：" + file4.getPath());

        // 4. getName()  获取文件的名称，带后缀
        System.out.println("获取文件的名称：" + file4.getName());
        // 5. lastModified() 返回文件的最后修改时间（时间毫秒值）
        long time = file4.lastModified();
        System.out.print("返回文件的最后修改时间（毫秒值）：" + time);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(time);
        System.out.println("  此时间戳转化时间为：" + format);

        System.out.println("========================================================================================");

    }


}
