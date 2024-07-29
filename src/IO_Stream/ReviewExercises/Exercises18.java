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

    private final static String dataSourceName = "src\\IO_Stream\\ExerciseFile\\姓名.txt";
    private final static String dataSourceRunCount = "src\\IO_Stream\\ExerciseFile\\程序运行次数.txt";
    private final static String dataSourceTempName = "src\\IO_Stream\\ExerciseFile\\姓名临时文件.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        long start = System.currentTimeMillis();

        // 获取数据输入流
        BufferedReader brName = new BufferedReader(new FileReader(dataSourceName, Charset.forName("UTF-8")));
        BufferedReader brRunCount = new BufferedReader(new FileReader(dataSourceRunCount, Charset.forName("UTF-8")));

        // 运行次数
        int runCount = 0;
        String line1;
        while ((line1 = brRunCount.readLine()) != null) {
            runCount = Integer.parseInt(line1) + 1;
        }

        brRunCount.close();

        BufferedWriter wrRunCount = new BufferedWriter(new FileWriter(dataSourceRunCount, Charset.forName("UTF-8")));
        wrRunCount.write(String.valueOf(runCount));
        wrRunCount.close();

        // 程序第一次运行时，将名字放入临时表
        if (runCount == 1) {
            ArrayList<String> nameList = new ArrayList<>();
            String line2;
            while ((line2 = brName.readLine()) != null) {
                nameList.add(line2);
            }

            // 打乱集合
            Collections.shuffle(nameList);

            System.out.println("点名集合长度：" + nameList.size());

            System.out.println(nameList.get(0) + "被点到！");

            nameList.remove(0);

            ObjectOutputStream oosTempName = new ObjectOutputStream(new FileOutputStream(dataSourceTempName));
            oosTempName.writeObject(nameList);
            oosTempName.close();

        } else if (runCount == 11) {
            // 运行次数重置为1
            BufferedWriter wrTempRunCount = new BufferedWriter(new FileWriter(dataSourceRunCount, Charset.forName("UTF-8")));
            wrTempRunCount.write("1");
            wrTempRunCount.close();


            ArrayList<String> nameList = new ArrayList<>();
            String line2;
            while ((line2 = brName.readLine()) != null) {
                nameList.add(line2);
            }

            // 打乱集合
            Collections.shuffle(nameList);
            System.out.println("点名集合长度：" + nameList.size());

            System.out.println(nameList.get(0) + "被点到！");

            nameList.remove(0);

            ObjectOutputStream oosTempName = new ObjectOutputStream(new FileOutputStream(dataSourceTempName));
            oosTempName.writeObject(nameList);
            oosTempName.close();

        } else {
            ObjectInputStream oisTempName = new ObjectInputStream(new FileInputStream(dataSourceTempName));
            ArrayList<String> nameList = (ArrayList<String>) oisTempName.readObject();
            // 打乱集合
            Collections.shuffle(nameList);
            System.out.println("点名集合长度：" + nameList.size());
            System.out.println(nameList.get(0) + "被点到！");
            nameList.remove(0);
            oisTempName.close();

            ObjectOutputStream oosTempName = new ObjectOutputStream(new FileOutputStream(dataSourceTempName));
            oosTempName.writeObject(nameList);
            oosTempName.close();

        }


        // 及时释放资源
        brName.close();

        long end = System.currentTimeMillis();
        System.out.println("\n运行时间：" + ((end - start) / 1000.0) + "s");
    }


}
