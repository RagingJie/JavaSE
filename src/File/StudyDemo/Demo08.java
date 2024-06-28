package File.StudyDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @Author
 * @Date 2024/6/28 15:03
 * @Description:
 */
public class Demo08 {
    public static void main(String[] args) {
        System.out.println();

         /*
            public  File[]  listFiles(FileFilter  filter)          利用文件名过滤器获取当前该路径下所有内容
            public  File[]  listFiles(FilenameFilter filter)       利用文件名过滤器获取当前该路径下所有内容
         */

        File file = new File("C:\\Users\\Naruto\\Desktop\\photo");


        // 1. listFiles(FileFilter  filter)   利用文件名过滤器获取当前该路径下所有内容
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".png");
//                return false;
            }
        });
        System.out.println("listFiles(FileFilter  filter)获取当前该路径下.png文件：" + Arrays.toString(files));
        System.out.println();

        // 2.listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容

        File[] files1 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir);
//                System.out.println(name);

                File f = new File(dir, name);

                return f.isFile() && f.getName().endsWith(".jpg");
            }
        });
        System.out.println("listFiles(FilenameFilter filter)获取当前该路径下.jpg文件：" + Arrays.toString(files1));

        System.out.println();
    }
}
