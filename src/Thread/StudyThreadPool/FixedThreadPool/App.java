package Thread.StudyThreadPool.FixedThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author
 * @Date 2024/8/3 23:22
 * @Description: 有上限的线程池
 */
public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 创建有上限的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);


        Future<Integer> result1 = pool.submit(new MyCallable());
        Future<Integer> result2 = pool.submit(new MyCallable());
        Future<Integer> result3 = pool.submit(new MyCallable());
        Future<Integer> result4 = pool.submit(new MyCallable());
        Future<Integer> result5 = pool.submit(new MyCallable());
        Future<Integer> result6 = pool.submit(new MyCallable());
        Future<Integer> result7 = pool.submit(new MyCallable());

        Integer sum1 = result1.get();
        Integer sum2 = result2.get();
        Integer sum3 = result3.get();
        Integer sum4 = result4.get();
        Integer sum5 = result5.get();
        Integer sum6 = result6.get();
        Integer sum7 = result7.get();


        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);
        System.out.println(sum6);
        System.out.println(sum7);
    }
}
