package File.StudyDemo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @Author
 * @Date 2024/6/28 14:18
 * @Description:
 */
public class Demo06 {

    public static void main(String[] args) {

        System.out.println("========================================================================================");

        /*
            public  static  File[]  listRoots                      列出可用的文件系统根
            public  File[]  listFiles()                            获取当前该路径下全部内容
            public  String[]  list()                               获取当前该路径下所有内容
            public  String[]  list(FilenameFilter filter)          利用文件名过滤器获取当前该路径下的所有内容
            public  File[]  listFiles(FileFilter  filter)          利用文件名过滤器获取当前该路径下所有内容
            public  File[]  listFiles(FilenameFilter filter)       利用文件名过滤器获取当前该路径下所有内容
        */

        // 1.listRoots()  列出可用的文件系统根  所有的系统盘符
        File[] files = File.listRoots();
//        for (File file : files) {
//            System.out.println(file);
//        }
        System.out.println("listRoots()获取所有的系统盘符：" + Arrays.toString(files));


        // 2.list()  获取当前该路径下所有内容（仅仅能获取名字）
        File file1 = new File("C:\\Users\\Naruto\\Desktop\\photo");
        String[] list = file1.list();
        System.out.println("list()获取当前该路径下所有内容：" + Arrays.toString(list));

        // 3.list(FilenameFilter filter)  利用文件名过滤器获取当前该路径下的所有内容
        // 需求：我现在要获取 ‪C:\Users\Naruto\Desktop\photo 文件夹中的所有jpeg文件
        File filePic = new File("C:\\Users\\Naruto\\Desktop\\photo");
        // accept方法的形参，依次表示photo文件夹里面每一个文件或者文件夹的路径
        // 参数一：父级路径
        // 参数二：子级路径
        // 返回值： 如果返回值为true，就表示当前路径保留
        //         如果返回值为false，就表示当前路径舍弃不要

        // lambda表达式写法
        String[] listPic1 = filePic.list((dir, name) -> {
            File file = new File(dir, name);
            return file.isFile() && file.getName().endsWith(".jpeg");
        });

        System.out.println("获取文件夹中的所有jpeg文件：(lambda表达式写法)：" + Arrays.toString(listPic1));

        // 匿名内部类
        String[] listPic2 = filePic.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                return file.isFile() && file.getName().endsWith(".png");
            }
        });

        System.out.println("获取文件夹中的所有png文件：(匿名内部类写法)：" + Arrays.toString(listPic2));

        System.out.println("========================================================================================");

    }


}
