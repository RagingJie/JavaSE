package IO_Stream.StudyIO.FileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/2 21:33
 * @Description: 文件拷贝（读取时使用字节数组）
 */
public class FileCopyDemo02 {

    public static void main(String[] args) throws IOException {

        // 创建对象
        FileInputStream fis = new FileInputStream("src\\IO_Stream\\ExerciseFile\\b.txt");
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\cc.txt");

        byte[] arr = new byte[2];

//        int len1 = fis.read(arr);
//        System.out.println(len1);  // 2
//        String str1 = new String(arr);
//        System.out.println(str1); // ab
//
//        int len2 = fis.read(arr);
//        System.out.println(len2); // 2
//        String str2 = new String(arr);
//        System.out.println(str2); // cd
//
//        int len3 = fis.read(arr);
//        System.out.println(len3); // 1
//        String str3 = new String(arr);
//        System.out.println(str3); // ed
//
//        int len4 = fis.read(arr);
//        System.out.println(len4); // -1
//        String str4 = new String(arr);
//        System.out.println(str4); // ed
//
//        int len5 = fis.read(arr);
//        System.out.println(len5); // -1
//        String str5 = new String(arr);
//        System.out.println(str5); // ed


        // 改进
        int len1 = fis.read(arr);
        System.out.println(len1);  // 2
        String str1 = new String(arr, 0, len1);
        System.out.println(str1); // ab

        int len2 = fis.read(arr);
        System.out.println(len2); // 2
        String str2 = new String(arr);
        System.out.println(str2); // cd

        int len3 = fis.read(arr);
        System.out.println(len3); // 1
        String str3 = new String(arr, 0, len3);
        System.out.println(str3); // e

        // 释放资源
        fos.close();
        fis.close();

    }
}
