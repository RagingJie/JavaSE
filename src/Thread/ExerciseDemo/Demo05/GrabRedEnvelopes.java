package Thread.ExerciseDemo.Demo05;

import cn.hutool.core.util.RandomUtil;

import java.math.BigDecimal;

/**
 * @Author
 * @Date 2024/8/2 14:16
 * @Description: 实现抢红包
 */
public class GrabRedEnvelopes extends Thread {

    // 红包金额 100
    static BigDecimal money = BigDecimal.valueOf(100.0);
    // 红包个数
    static int count = 3;
    // 红包最小值 0.01元
    static final BigDecimal MIN = BigDecimal.valueOf(0.01);

    @Override
    public void run() {
        // 加锁
        synchronized (GrabRedEnvelopes.class) {
            if (count == 0) {
                System.out.println(getName() + "没抢到红包！");
            } else {
                // 抽到的金额
                BigDecimal prize;

                if (count == 1) {
                    // 最后一个红包了
                    prize = money;
                } else {
                    // 表示第一次，第二次（随机）
                    // 100元 3个
                    // 第一个红包：99.98
                    // 100 - (3-1) * 0.01  随机数
                    BigDecimal bounds = money.subtract((BigDecimal.valueOf(count - 1)).multiply(MIN));
                    prize = RandomUtil.randomBigDecimal(bounds);
                    if (prize.compareTo(MIN) == -1) {
                        prize = MIN;
                    }

                }

                // 做减红包处理
                money = money.subtract(prize).setScale(2, BigDecimal.ROUND_HALF_UP);
                // 个数-1
                count--;
                System.out.println(getName() + "抢到了" + prize.setScale(2, BigDecimal.ROUND_HALF_UP) + "元");
            }
        }
    }
}
