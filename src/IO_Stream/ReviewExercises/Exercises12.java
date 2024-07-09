package IO_Stream.ReviewExercises;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Author
 * @Date 2024/7/9 11:12
 * @Description:
 */
public class Exercises12 {

    private final static String dataSourcePath = "src\\IO_Stream\\ExerciseFile\\read.txt";
    private final static String destinationSourcePath = "src\\IO_Stream\\ExerciseFile\\write(UTF-8).txt";

    /*
            将本地文件中的GBK文件，转成UTF-8
     */

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // jdk11以前的方案
//        InputStreamReader isr = new InputStreamReader(new FileInputStream(dataSourcePath), "GBK");
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destinationSourcePath), "UTF-8");
//
//        int res;
//        while ((res = isr.read()) != -1) {
//            osw.write(res);
//        }
//
//        osw.close();
//        isr.close();

        // jdk11之后
        FileReader fr = new FileReader(dataSourcePath, Charset.forName("GBK"));
        FileWriter fw = new FileWriter(destinationSourcePath, Charset.forName("UTF-8"));

        int res;
        while ((res = fr.read()) != -1) {
            fw.write(res);
        }

        fw.close();
        fr.close();

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }

}
