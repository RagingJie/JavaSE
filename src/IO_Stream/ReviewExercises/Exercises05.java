package IO_Stream.ReviewExercises;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author
 * @Date 2024/7/8 11:12
 * @Description: 修改文件中的数据
 */
public class Exercises05 {

    // 文本文件中有一下数据：
    //          2-8-4-3-9-6
    // 将文件中的数据进行排序，变成一下的数据：
    //          2-3-4-6-8-9
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 数据源
        FileReader fr = new FileReader("src\\IO_Stream\\ExerciseFile\\zzz.txt");

        StringBuilder sb = new StringBuilder();

        int len;
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }

        // 释放资源
        fr.close();

        // Stream流的方式
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        String preResult = Arrays.toString(arr).replaceAll(", ", "-");  // 数组要用工具类转为String类型
        String result = preResult.substring(1, preResult.length() - 1);   // 包头不包尾

        // 目的地
        FileWriter fw = new FileWriter("src\\IO_Stream\\ExerciseFile\\zzz.txt");

        // 写出数据
        fw.write(result);

        // 释放资源
        fw.close();

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }
}
