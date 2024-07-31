package Thread.StudyThread.ThreadSafe.Demo02;

/**
 * @Author
 * @Date 2024/7/31 16:10
 * @Description:
 */
public class MyRunnable implements Runnable {

    // 票数
    int ticketCount = 0;

    @Override
    public void run() {

        while (true) {
            if (method()) break;
        }
    }

    // 同步方法
    private synchronized boolean method() {
        if (ticketCount == 500) {
            return true;
        } else {
            ticketCount++;
            System.out.println(Thread.currentThread().getName() + "@售卖了第" + ticketCount + "张门票");
        }
        return false;
    }

}
