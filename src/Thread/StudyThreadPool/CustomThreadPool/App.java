package Thread.StudyThreadPool.CustomThreadPool;

import java.util.concurrent.*;

/**
 * @Author
 * @Date 2024/8/4 0:48
 * @Description: 自定义线程池
 */
public class App {
    /*
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor()
        (核心线程数量，最大线程数量，空闲线程最大存活时间，任务队列，创建线程工厂，任务的拒绝策略)

        参数一：核心线程数量              不能小于0
        参数二：最大线程数                不能小于0，最大数量 >= 核心线程数量
        参数三：空闲线程最大存活时间        不能小于0
        参数四：时间单位                  用TimeUnit指定
        参数五：任务队列                  不能为null
        参数六：创建线程工厂               不能为null
        参数七：任务的拒绝策略             不能为null

    */
    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, // 核心线程数量，不能小于0
                6, // 最大线程数，不能小于0，最大数量 >= 核心线程数量
                60, // 空闲线程最大存活时间，不能小于0
                TimeUnit.SECONDS, // 时间单位，用TimeUnit指定
                new ArrayBlockingQueue<>(3), // 任务队列（阻塞队列）
                Executors.defaultThreadFactory(),  // 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()  // 任务的拒绝策略
        );

        // 提交任务
//        pool.submit();

        // 关闭线程池
        pool.shutdown();
    }
}
