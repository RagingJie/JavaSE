package Thread.StudyThreadPool.CachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author
 * @Date 2024/8/2 17:20
 * @Description: 无上限的线程池
 */
public class App {
    public static void main(String[] args) {

        // 创建无上限的线程池
        ExecutorService pool = Executors.newCachedThreadPool();

        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
    }
}
