package Thread.ExerciseDemo.Demo07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author
 * @Date 2024/8/2 15:39
 * @Description:
 */
public class DrawPool extends Thread {

    ArrayList<Integer> list;

    // 线程1
    static ArrayList<Integer> list1 = new ArrayList<>();
    // 线程2
    static ArrayList<Integer> list2 = new ArrayList<>();

    public DrawPool(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (DrawPool.class) {
                if (list.size() == 0) {
                    if ("抽奖箱1".equals(getName())) {
                        System.out.println();
                        System.out.println("抽奖箱1" + list1);
                        System.out.println("最高奖项为" + getMax(list1) + "元，总计额为" + getSum(list1) + "元");
                    } else {
                        System.out.println();
                        System.out.println("抽奖箱2" + list2);
                        System.out.println("最高奖项为" + getMax(list2) + "元，总计额为" + getSum(list2) + "元");
                    }
                    break;
                } else {
                    // 打乱一下抽奖箱
                    Collections.shuffle(list);
                    // 返回的是移除的元素
                    Integer removeNum = list.remove(0);

                    if ("抽奖箱1".equals(getName())) {
                        list1.add(removeNum);
                    } else {
                        list2.add(removeNum);
                    }
                }
            }

            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param list 金额集合
     * @return java.lang.Integer
     * @author Naruto
     * @date 2024/8/2 16:02
     * @description 获取最大值
     */
    private Integer getMax(List<Integer> list) {
        Integer max = 0;
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * @param list 金额集合
     * @return java.lang.Integer
     * @author Naruto
     * @date 2024/8/2 16:03
     * @description 获取累计金额
     */
    private Integer getSum(List<Integer> list) {
        Integer sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }
}
