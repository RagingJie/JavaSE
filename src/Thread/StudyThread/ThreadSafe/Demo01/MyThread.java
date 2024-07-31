package Thread.StudyThread.ThreadSafe.Demo01;


/**
 * @Author
 * @Date 2024/7/31 11:03
 * @Description:
 */
public class MyThread extends Thread {

    // 表示这个类所有的对象，都共享ticket数据
    static int ticketCount = 0;  // 0~99

    // 锁对象，一定要是唯一的
//    static Object lock = new Object();

    @Override
    public void run() {

        while (true) {
            // 同步代码块
            synchronized (MyThread.class) {
                if (ticketCount < 500) {
//                    try {
//                        sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    ticketCount++;
                    System.out.println(getName() + "@售卖了第" + ticketCount + "张门票");
                } else {
                    break;
                }
            }
        }

    }
}
