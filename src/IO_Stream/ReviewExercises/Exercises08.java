package IO_Stream.ReviewExercises;

import java.io.*;

/**
 * @Author
 * @Date 2024/7/9 11:12
 * @Description: 拷贝文件
 */
public class Exercises08 {

    private final static String dataSourceFilePath = "C:\\百度下载\\007.舌尖上的中国第二季【普通话 全7集 1080P  33G】\\001.第1集 脚步.mp4";
    private final static String destinationSourceFilePath = "C:\\Users\\Naruto\\Desktop\\video\\copy.mp4";

    /**
     * 四种方式拷贝文件，并统计各自用时
     */

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 字节流的基本流： 一次写一个字节 5,095,362,921 字节
//        method1();  // 耗时太长

        // 字节流的基本流：一次读一个字节数组
        method2();    // 运行时间：8.509s

        // 字节流的缓冲流：一次读写一个字节
//        method3();  // 运行时间：94.372s

        // 字节流的缓冲流：一次读写一个字节数组
//        method4();  // 运行时间：8.823s

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/9 10:57
     * @description 字节流的基本流： 一次写一个字节 5,095,362,921 字节
     */
    private static void method1() throws IOException {
        // 数据源
        FileInputStream fis = new FileInputStream(dataSourceFilePath);
        // 目的地
        FileOutputStream fos = new FileOutputStream(destinationSourceFilePath);

        // 读写数据
        int r;
        while ((r = fis.read()) != -1) {
            fos.write(r);
        }

        // 释放资源
        fos.close();
        fis.close();
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/9 10:58
     * @description 字节流的基本流：一次读一个字节数组
     */
    private static void method2() throws IOException {

        // 数据源
        FileInputStream fis = new FileInputStream(dataSourceFilePath);
        // 目的地
        FileOutputStream fos = new FileOutputStream(destinationSourceFilePath);

        // 字节数组 8192
        byte[] bytes = new byte[8192]; // 8KB

        // 读写数据
        int r;
        while ((r = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, r);
        }

        // 释放资源
        fos.close();
        fis.close();
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/9 11:01
     * @description 字节流的缓冲流：一次读写一个字节
     */
    private static void method3() throws IOException {
        // 数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(dataSourceFilePath));
        // 目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationSourceFilePath));

        // 读写数据
        int r;
        while ((r = bis.read()) != -1) {
            bos.write(r);
        }

        // 释放资源
        bos.close();
        bis.close();
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/9 11:08
     * @description 字节流的缓冲流：一次读写一个字节数组
     */
    private static void method4() throws IOException {

        // 数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(dataSourceFilePath));
        // 目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationSourceFilePath));

        // 读写数据
        // 字节数组
        byte[] bytes = new byte[8192];  // 8KB

        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //释放资源
        bos.close();
        bis.close();

    }
}
