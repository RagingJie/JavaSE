package Thread.StudyThreadPool.CachedThreadPool;

/**
 * @Author
 * @Date 2024/8/2 17:31
 * @Description:
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
    }
}
