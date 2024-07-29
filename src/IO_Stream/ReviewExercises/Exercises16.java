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
public class Exercises16 {

    /* 需求
            有一个文件里面存储了班级同学的信息，每一个信息占一行
            格式为：张三-男-23
            要求通过程序时间随机点名器

       运行结果：
            70%的概率随机到男生
            30%的概率随机到女生
            总共随机100万次，统计结果
            注意观察：看生成男生和女生的比例是不是接近于 7:3
     */

    private final static String dataSource = "src\\IO_Stream\\ExerciseFile\\假数据信息.txt";

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // 获取数据输入流
        BufferedReader br = new BufferedReader(new FileReader(dataSource, Charset.forName("UTF-8")));


        // 存储性别的集合
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        ArrayList<String> sexList = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            sexList.add(line.split("-")[1]);
        }

        // 及时释放资源
        br.close();

        for (int i = 0; i < 10000000; i++) {
            getRatio(sexList, boyList, girlList);
        }
        System.out.println("7:3的比例为：" + (7 / 3.0));   // 7:3的比例为：2.3333333333333335
        System.out.println("男生被选中的次数：" + boyList.size());
        System.out.println("女生被选中的次数：" + girlList.size());
        System.out.println("男女比例为：" + boyList.size() / 1.0 / girlList.size());   // 1000万次，结果：2.333740049619387

        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");

    }

    /**
     * @param sexList  性别集合
     * @param boyList  男生集合
     * @param girlList 女生集合
     * @return void
     * @author Naruto
     * @date 2024/7/29 17:09
     * @description 获取概率
     */
    private static void getRatio(ArrayList<String> sexList, ArrayList<String> boyList, ArrayList<String> girlList) throws IOException {
        Collections.shuffle(sexList);
        String sex = sexList.get(0);
        if (sex.equals("男")) {
            boyList.add(sex);
        } else {
            girlList.add(sex);
        }
    }
}
