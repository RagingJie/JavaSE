package Thread.ExerciseDemo.Demo02;

import java.text.SimpleDateFormat;

/**
 * @Author
 * @Date 2024/8/2 10:52
 * @Description:
 */
public class MyThread extends Thread {

    // 1000张电影票
    static int ticketCount = 0;

    @Override
    public void run() {

        synchronized (MyThread.class) {
            // 同步代码块
            while (true) {
                if (ticketCount == 100) {
                    break;
                } else {
                    try {
                        long currentTime = System.currentTimeMillis();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String time = dateFormat.format(currentTime);
                        sleep(3000);
                        ticketCount++;
                        System.out.println(time + "  " + getName() + "卖出了第" + ticketCount + "张票！");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
