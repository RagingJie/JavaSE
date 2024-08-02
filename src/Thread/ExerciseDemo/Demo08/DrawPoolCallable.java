package Thread.ExerciseDemo.Demo08;

import Thread.ExerciseDemo.Demo07_Improve.DrawPool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/**
 * @Author
 * @Date 2024/8/2 16:29
 * @Description:
 */
public class DrawPoolCallable implements Callable<Integer> {

    ArrayList<Integer> list;

    public DrawPoolCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<>();

        while (true) {
            synchronized (DrawPool.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                } else {
                    // 打乱一下抽奖箱
                    Collections.shuffle(list);
                    // 返回的是移除的元素
                    Integer removeNum = list.remove(0);
                    boxList.add(removeNum);
                }
            }
            Thread.sleep(10);
        }

        if (boxList.size() == 0) {
            return null;
        }

        return Collections.max(boxList);
    }
}
