package IO_Stream.ReviewExercises;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author
 * @Date 2024/7/9 11:12
 * @Description: 出师表排序 || 使用TreeMap集合进行排序
 */
public class Exercises09 {

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

        // TreeMap 根据其键（key）的自然顺序或比较器（Comparator）自动对元素进行排序
        TreeMap<Integer, String> tm = new TreeMap<>();

        // 读取数据
        String line;
        while ((line = br.readLine()) != null) {
            tm.put(Integer.parseInt(line.substring(0, 1)), line);
        }

        // 写出数据
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }

        // 释放资源
        bw.close();
        br.close();

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }

}
