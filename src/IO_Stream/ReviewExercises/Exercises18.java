package IO_Stream.ReviewExercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Naruto
 * @date 2024/7/11 0:50
 * @description
 */
public class Exercises18 {

    /* 需求
            有一个文件里面存储了班级同学的姓名，每一个姓名占一行
            要求通过程序实现随机点名器

       运行结果：
            被点到的学生不会被点到
            如果班级中所有的学生都点完了，需要自动的重新开启第二轮点名
            细节1：假设班级有10个学生，每一轮中每一位学生只能被点到一次，程序运行10次，第一轮结束
            细节2：第11次运行的时候，我们自己不需要手动操作本地文件，要求程序自动开始第二轮点名
     */

    private final static String dataSource = "src\\IO_Stream\\ExerciseFile\\姓名.txt";

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // 获取数据输入流
        BufferedReader br = new BufferedReader(new FileReader(dataSource, Charset.forName("UTF-8")));

        int count = 0;
        // 存储姓名的集合
        ArrayList<String> nameList = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            nameList.add(line);
            count++;
        }

        // 及时释放资源
        br.close();

        for (String s : nameList) {
            System.out.println(s);
        }



        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
        System.out.println("数据个数：" + count + "条");
    }


}
