package IO_Stream.ReviewExercises;

import java.io.*;

/**
 * @Author
 * @Date 2024/7/8 11:12
 * @Description: 拷贝文件 (字节缓冲流) ======>  字节数组读写
 */
public class Exercises07 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\IO_Stream\\ExerciseFile\\theSunIsNotDryAndTheBreezeIsJustRight.txt"));
        // 目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\IO_Stream\\ExerciseFile\\copy.txt"));

        byte[] bytes = new byte[1024 * 2];

        // 每次读取一个字节
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes);
        }

        // 释放资源，将缓冲区的数据写出
        // 细节：如没有释放或刷新资源，数据是不会写出到本地文件的
        bos.close();
        bis.close();
//        bos.flush();

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }
}
