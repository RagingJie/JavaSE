package Thread.StudyThread.ThreadSafe.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author
 * @Date 2024/7/31 16:32
 * @Description:
 */
public class MyThread extends Thread {

    static int ticketCount = 0;  // 使用static修饰，目的是想让线程共同使用同一个变量

    // 锁对象，因为Lock是接口，不能直接创建，只能创建他的实现类ReentrantLock
    static Lock lock = new ReentrantLock();  //使用static修饰，目的是想让线程共同使用同一把锁

    @Override
    public void run() {
        while (true) {
            lock.lock();  // 在循环外面谁拿到锁，就是谁的了，在里面大家都可以竞争
            try {
                if (ticketCount == 500) {
                    break;
                } else {
                    sleep(10);
                    ticketCount++;
                    System.out.println(getName() + "@售卖了第" + ticketCount + "张门票");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }
}
