package Thread.ExerciseDemo.Demo04;

import java.text.SimpleDateFormat;

/**
 * @Author
 * @Date 2024/8/2 10:52
 * @Description:
 */
public class MyThread extends Thread {

    // 1~100之间的数
    // 奇数的定义：指不能被2整除的整数 ，数学表达形式为：2k+1， 奇数可以分为正奇数和负奇数。
    static int num = 1;

    @Override
    public void run() {

        synchronized (MyThread.class) {
            // 同步代码块
            while (true) {
                if (num == 100) {
                    break;
                } else {
                    if (num % 2 != 0) {
                        System.out.print(num + "，");
                    }
                    num++;
                }
            }
        }
    }
}
