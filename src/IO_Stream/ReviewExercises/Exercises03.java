package IO_Stream.ReviewExercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/8 11:12
 * @Description: 文件加密
 */
public class Exercises03 {

    // 为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理
    // 加密原理：
    //          对原始文件中的【每一个字节】数据进行更改，然后将更改以后的数据存储到新的文件中
    // 解密原理：
    //          读取加密之后的文件，按照加密的规则反向操作，变成原始文件。


    /*

         ^：异或
            两边相同：false
            两边不同：true

            0：false
            1：true

            100：1100100
            10： 1010

            0110 0100
          ^ 0000 1010
          ____________
            0110 1110   ====> 十进制：110
          ^ 0000 1010
          ____________
            0110 0100   =====> 十进制：100

            与同一个字符异或两次可得到原始数据

     */


    public static void main(String[] args) throws IOException {

        System.out.println(100 ^ 10);
        System.out.println(110 ^ 10);

        // 加密
        // 数据源
//        FileInputStream fis = new FileInputStream("src\\IO_Stream\\ExerciseFile\\fff.txt");
//        // 目的文件
//        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\jiami.txt");

        // 解密

        // 数据源
        FileInputStream fis = new FileInputStream("src\\IO_Stream\\ExerciseFile\\jiami.txt");
        // 目的文件
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\jiemi.txt");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 10);
        }

        // 释放资源
        fos.close();
        fis.close();


    }
}
