package File.StudyDemo;

import java.io.File;

/**
 * @Author
 * @Date 2024/6/28 1:19
 * @Description:
 */
public class Demo05 {

    public static void main(String[] args) {

        /**
         public  File[]  listFiles()   获取当前该路径下全部内容


         重点：：
                当调用者File表示的路径不存在时，返回null
                当调用者File表示的路径是文件时，返回null
                当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
                当调用者File表示的路径是一个有内容的文件夹时，将里面所有的文件夹和文件的路径放在File数组中返回
                当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有的文件夹和文件的路径放在File数组中返回，包含隐藏的文件
                当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
         */

        File file = new File("C:\\Users\\Naruto\\Desktop\\photo");
        File[] files = file.listFiles();

        for (File item : files) {
            if (item.isFile()) {
                System.out.println("【" + item + "】========是文件");
            }
            if (item.isDirectory()) {
                System.out.println("【" + item + "】========是文件夹");
            }
        }

    }
}
