package Thread.StudyThreadPool.FixedThreadPool;

import java.util.concurrent.Callable;

/**
 * @Author
 * @Date 2024/8/3 23:19
 * @Description: 返回1~100的累加和
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName()+"--------");
        return sum;
    }
}
