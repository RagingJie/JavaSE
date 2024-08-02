package Thread.ExerciseDemo.Demo07;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author
 * @Date 2024/8/2 14:03
 * @Description:
 */
public class App {
    /*
        在上一题的基础上完成如下需求：
            每次抽中的过程中，不打印，抽完时，一次性打印（随机）
            在此次抽奖过程中，抽奖箱1共产生了6个奖项
                分别是：10,20,100,500,2,300最高奖项为300元，总计额为932元
            在此次抽奖过程中，抽奖箱2共产生了6个奖项
                分别是：5.50,200,800,80,700最高奖项为800元，总计额为1835元
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 320, 500, 800, 2, 300, 80, 700);

        DrawPool drawPool1 = new DrawPool(list);
        DrawPool drawPool2 = new DrawPool(list);

        drawPool1.setName("抽奖箱1");
        drawPool2.setName("抽象箱2");

        drawPool1.start();
        drawPool2.start();
    }
}
