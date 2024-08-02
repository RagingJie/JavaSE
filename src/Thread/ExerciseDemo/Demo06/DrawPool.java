package Thread.ExerciseDemo.Demo06;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author
 * @Date 2024/8/2 15:39
 * @Description:
 */
public class DrawPool extends Thread {

    ArrayList<Integer> list;

    public DrawPool(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (DrawPool.class) {
                if (list.size() == 0) {
                    break;
                } else {
                    // 打乱一下抽奖箱
                    Collections.shuffle(list);
                    System.out.println(getName() + "又产生了一个" + list.get(0) + "元大奖");
                    list.remove(0);
                }
            }

            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
