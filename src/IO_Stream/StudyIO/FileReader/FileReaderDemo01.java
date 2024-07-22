package IO_Stream.StudyIO.FileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/7 23:39
 * @Description:  read()方法，不带参数
 */
public class FileReaderDemo01 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 创建对象
        FileReader fr = new FileReader("src\\IO_Stream\\ExerciseFile\\fff.txt");

        // read方法读取数据
        // 字符流的底层也是字节流，默认也是一个字节一个字节的读取的
        // 如果遇到中文就会一次读取多个，GBK一次读两个字节，UTF-8一次读三个字节

        // read() 细节；
        // 1. read()：默认也是一个字节一个字节的读取的，如果遇到中文就会一次读取多个
        // 2.在读取之后，方法的底层还会进行解码并转成十进制
        //      最终把这个十进制作为返回值
        //      这个十进制的数据也表示在字符集上的数字
        //      英文：文件里面二进制数据  0110 0001
        //          read方法进行读取，解码并转成十进制97
        //      中文：文件里面的二进制数据： 11100110 10110001 10001001
        //          read方法进行读取，解码并转成十进制27721

        // 我想看到中文汉字，就是把这些十进制数据，再进行强转就可以了

        int index;
        while ((index = fr.read()) != -1) {
            System.out.print((char) index);
        }

        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println();


        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");

        // 释放资源
        fr.close();
    }
}
