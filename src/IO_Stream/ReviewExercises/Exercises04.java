package IO_Stream.ReviewExercises;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author
 * @Date 2024/7/8 11:12
 * @Description: 修改文件中的数据
 */
public class Exercises04 {

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

        String[] dataSourceList = sb.toString().split("-");
        List<Integer> list = new ArrayList<>();
        for (String s : dataSourceList) {
            list.add(Integer.parseInt(s));
        }

        // 排序，默认从小到大排
        Collections.sort(list);

        String result = list.toString().replaceAll(", ", "-").replaceAll("\\[", "").replaceAll("]", "");
        System.out.println("排序结果为：" + result);

        // 目的地
        FileWriter fw = new FileWriter("src\\IO_Stream\\ExerciseFile\\zzz.txt");

        // 写出数据
        fw.write(result);

        // 释放资源
        fw.close();
        fr.close();

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }
}
