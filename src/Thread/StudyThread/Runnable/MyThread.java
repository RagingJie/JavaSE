package Thread.StudyThread.Runnable;

/**
 * @Author
 * @Date 2024/7/30 16:01
 * @Description:
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            Thread thread = Thread.currentThread();  // 当前线程
//            System.out.println(thread.getName() + "实现多线程学习！！！");
            System.out.println(Thread.currentThread().getName() + "实现多线程学习！！！");
        }
    }
}
