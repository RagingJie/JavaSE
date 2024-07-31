package Thread.StudyThread.ThreadSafe.LockDead;

/**
 * @Author
 * @Date 2024/7/31 17:07
 * @Description:
 */
public class MyThread extends Thread {

    Object objA = new Object();
    Object objB = new Object();

    @Override
    public void run() {

        while (true) {
            if ("线程A".equals(getName())) {
                synchronized (objA) {
                    System.out.println("线程A拿到了A锁，准备拿B锁");
                    synchronized (objB) {
                        System.out.println("线程A拿到了B锁，顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) {
                synchronized (objB) {
                    System.out.println("线程B拿到了B锁，准备拿A锁");
                    synchronized (objA) {
                        System.out.println("线程B拿到了A锁，顺利执行完一轮");
                    }
                }
            }

        }
    }
}
