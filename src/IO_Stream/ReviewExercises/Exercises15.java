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
public class Exercises15 {

    /* 需求
            有一个文件里面存储了班级同学的信息，每一个信息占一行
            格式为：张三-男-23
            要求通过程序时间随机点名器

       运行结果：
            第一次运行程序：随机同学姓名1（只显示名字）
            第二次运行程序：随机同学姓名2（只显示名字）
            第三次运行程序：随机同学姓名3（只显示名字）
            ........
     */

    private final static String dataSource = "src\\IO_Stream\\ExerciseFile\\假数据信息.txt";

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // 获取数据输入流
        BufferedReader br = new BufferedReader(new FileReader(dataSource, Charset.forName("UTF-8")));

        int count = 0;
        // 存储姓名的集合
        ArrayList<String> nameList = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            nameList.add(line.split("-")[0]);
            count++;
        }

        // 及时释放资源
        br.close();

        // 打乱集合
        Collections.shuffle(nameList);

        System.out.println("随机同学：" + nameList.get(0) + "\n");

        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
        System.out.println("数据个数：" + count + "条");
    }


}
