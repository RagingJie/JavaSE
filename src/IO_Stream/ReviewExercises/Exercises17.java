package IO_Stream.ReviewExercises;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Naruto
 * @date 2024/7/11 0:50
 * @description
 */
public class Exercises17 {

    /* 需求
            有一个文件里面存储了班级同学的信息，每一个信息占一行
            格式为：张三-男-23
            第三次必定是张三

       运行结果：
            第一次运行程序：随机同学姓名1（只显示名字）
            第二次运行程序：随机同学姓名2（只显示名字）
            第三次运行程序：张三
     */

    private final static String dataSource = "src\\IO_Stream\\ExerciseFile\\假数据信息.txt";
    private final static String runCountSource = "src\\IO_Stream\\ExerciseFile\\程序运行次数.txt";

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // 获取数据输入流
        BufferedReader br = new BufferedReader(new FileReader(dataSource, Charset.forName("UTF-8")));
        // 获取数据输出流

        BufferedReader brCount = new BufferedReader(new FileReader(runCountSource, Charset.forName("UTF-8")));

        // 系统运行次数
        int runCount = 0;

        String line1;
        while ((line1 = brCount.readLine()) != null) {
            runCount = Integer.parseInt(line1) + 1;
            System.out.println("系统运行次数：" + runCount + "次");
        }


        // 及时释放资源
        brCount.close();

        if (runCount == 3) {
            System.out.println("随机同学：张三");
        } else {
            // 存储姓名的集合
            ArrayList<String> nameList = new ArrayList<>();

            String line2;
            while ((line2 = br.readLine()) != null) {
                nameList.add(line2.split("-")[0]);
            }

            // 打乱集合
            Collections.shuffle(nameList);

            System.out.println("随机同学：" + nameList.get(0) + "\n");
        }

        BufferedWriter bwCount = new BufferedWriter(new FileWriter(runCountSource, Charset.forName("UTF-8")));
        bwCount.write(String.valueOf(runCount));
        // 及时释放资源
        bwCount.close();

        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }


}
