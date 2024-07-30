package Thread.StudyThread.Callable;

import java.util.concurrent.Callable;

/**
 * @Author
 * @Date 2024/7/30 16:18
 * @Description:
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        // 获取1~100之间的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
