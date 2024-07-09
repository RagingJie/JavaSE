package IO_Stream.ReviewExercises;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author
 * @Date 2024/7/9 11:12
 * @Description: 转换流练习
 */
public class Exercises13 {

    private final static String dataSourcePath = "src\\IO_Stream\\ExerciseFile\\read.txt";

    /*
            利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码

            1.字节流在读取中文的时候，是会出现乱码的，但是字符流可以搞定
            2.字节流里面是没有读一整行的方法的，只有字符缓冲流才能搞定
     */

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

//        FileInputStream fis = new FileInputStream(dataSourcePath); // 基本字节流
//        InputStreamReader isr = new InputStreamReader(fis, "GBK"); // 转换流
//        BufferedReader br = new BufferedReader(isr); //缓冲流
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        br.close();

        // 层层包装
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(dataSourcePath), "GBK"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }

}
