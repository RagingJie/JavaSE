package Thread.ExerciseDemo.Demo06;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author
 * @Date 2024/8/2 13:58
 * @Description:
 */
public class App {
    /*
            有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为
            {10,5,20,50,100,320,500,800,2,300,80,700}
            创建两个抽奖箱（线程）设置线程名称分别为：“抽奖箱1”，“抽奖箱2”
            随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
                每次抽出一个奖项就打印一个（随机）
                抽奖箱1又产生了一个 10 元大奖
                抽奖箱1又产生了一个 100 元大奖
                抽奖箱2又产生了一个 5 元大奖
                抽奖箱1又产生了一个 20 元大奖
                抽奖箱2又产生了一个 300 元大奖
                抽奖箱1又产生了一个 700 元大奖
                .......
    */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 320, 500, 800, 2, 300, 80, 700);

        DrawPool drawPool1 = new DrawPool(list);
        DrawPool drawPool2 = new DrawPool(list);

        drawPool1.setName("抽奖箱1");
        drawPool2.setName("抽象想2");

        drawPool1.start();
        drawPool2.start();

    }
}
