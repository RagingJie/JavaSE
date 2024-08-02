package Thread.ExerciseDemo.Demo08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author
 * @Date 2024/8/2 14:09
 * @Description:
 */
public class App {
    /*
        在上一题的基础上完成如下需求：
            每次抽中的过程中，不打印，抽完时，一次性打印（随机）
            在此次抽奖过程中，抽奖箱1共产生了6个奖项
                分别是：10,20,100,500,2,300
                最高奖项为300元，总计额为932元
            在此次抽奖过程中，抽奖箱2共产生了6个奖项
                分别是：5.50,200,800,80,700
                最高奖项为800元，总计额为1835元
            在此抽奖过程中，抽奖箱2中产生了最大奖项，该奖项金额为800元

         以上打印效果只是数据模拟，实际代码运行的效果会有差异
    */

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 320, 500, 800, 2, 300, 80, 700);

        // 创建多线程要运行的参数对象
        DrawPoolCallable d1 = new DrawPoolCallable(list);
        DrawPoolCallable d2 = new DrawPoolCallable(list);

        // 创建多线程运行结果的管理者对象
        FutureTask<Integer> ft1 = new FutureTask<>(d1);
        FutureTask<Integer> ft2 = new FutureTask<>(d2);

        // 创建线程对象
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        // 设置名字
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        // 启动线程
        t1.start();
        t2.start();

        // 获取线程结果
        Integer max1 = ft1.get();
        Integer max2 = ft2.get();

//        System.out.println(max1);
//        System.out.println(max2);

        if (max1 > max2) {
            System.out.println("在此抽奖过程中，抽象箱1抽中了最大奖项：" + max1 + "元");
        } else {
            System.out.println("在此抽奖过程中，抽象箱2抽中了最大奖项：" + max2 + "元");
        }
    }
}
