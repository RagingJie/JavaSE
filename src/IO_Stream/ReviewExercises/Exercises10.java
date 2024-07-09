package IO_Stream.ReviewExercises;

import java.io.*;
import java.util.*;

/**
 * @Author
 * @Date 2024/7/9 11:12
 * @Description: 出师表排序 || 使用Collections.sort对遍历行数据存放的list排序
 */
public class Exercises10 {

    private final static String dataSourcePath = "src\\IO_Stream\\ExerciseFile\\csb.txt";
    private final static String destinationSourcePath = "src\\IO_Stream\\ExerciseFile\\csbResult.txt";

    /**
     * 为打乱的《出师表》文章根据据序号排序
     * <p>
     * 使用字符缓冲流的特有的两个方法
     */

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 数据源
        BufferedReader br = new BufferedReader(new FileReader(dataSourcePath));
        // 目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter(destinationSourcePath));

        ArrayList<String> list = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

//        Collections.sort(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });

        System.out.println(list);

        // 写出数据
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        // 释放资源
        bw.close();
        br.close();

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }

}
