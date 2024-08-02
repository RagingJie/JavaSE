package Thread.ExerciseDemo.Demo03;

import java.text.SimpleDateFormat;

/**
 * @Author
 * @Date 2024/8/2 10:52
 * @Description:
 */
public class MyThread extends Thread {

    // 100份礼物
    static int giftCount = 100;
    // 标记第积分礼物
    static int index = 0;

    @Override
    public void run() {

        synchronized (MyThread.class) {
            // 同步代码块
            while (true) {
                if (giftCount < 10) {
                    break;
                } else {
                    long currentTime = System.currentTimeMillis();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String time = dateFormat.format(currentTime);
                    giftCount--;
                    index++;
                    System.out.println(time + "  " + getName() + "送出了第" + index + "份礼品，还剩" + giftCount + "份");
                }
            }
        }
    }
}
