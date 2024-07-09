package IO_Stream.ReviewExercises;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author
 * @Date 2024/7/9 11:12
 * @Description:
 */
public class Exercises11 {

    private final static String dataSourcePath = "src\\IO_Stream\\ExerciseFile\\count.txt";

    /*
          实现一个验证程序运行次数的小程序，要求如下：
          1.当程序运行超过3次时，给出提示：本软件只能免费使用3次，欢迎您注册会员后继续使用~
          2.程序运行演示如下：
              第一次运行控制台输出：欢迎使用本软件，第1次使用免费~
              第二次运行控制台输出：欢迎使用本软件，第2次使用免费~
              第三次运行控制台输出：欢迎使用本软件，第3次使用免费~
              第四次及之后运行控制台输出：本软件只能免费使用3次，欢迎您注册会员后继续使用~
     */


    // IO原则
    // 随用随创建
    //      什么时候不用什么时候关闭

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 数据源
        BufferedReader br = new BufferedReader(new FileReader(dataSourcePath));

        // 使用次数
        int count = Integer.parseInt(br.readLine());
        count++;

        if (count < 4) {
            System.out.println("欢迎使用本软件，第" + count + "次使用免费~");
        } else {
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~");
        }

        // 释放资源
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(dataSourcePath));

        bw.write(String.valueOf(count));

        // 释放资源
        bw.close();

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }

}
