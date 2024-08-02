package Thread.ExerciseDemo.Demo07_Improve;

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

    public DrawPool(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (DrawPool.class) {
                if (list.size() == 0) {
                    System.out.println();
                    System.out.println(getName() + boxList);
                    System.out.println("最高奖项为" + getMax(boxList) + "元，总计额为" + getSum(boxList) + "元");
                    break;
                } else {
                    // 打乱一下抽奖箱
                    Collections.shuffle(list);
                    // 返回的是移除的元素
                    Integer removeNum = list.remove(0);
                    boxList.add(removeNum);
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
