package Test;

import java.text.SimpleDateFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author
 * @Date 2024/7/26 14:35
 * @Description: 定时任务
 */
public class Test10 {

    private static final ScheduledExecutorService scheduled = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) {

        scheduled.scheduleAtFixedRate(() -> active(), 0, 8, TimeUnit.SECONDS);
    }


    private static void active() {
        long dataTime = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("定时任务运行时间：" + (dateFormat.format(dataTime)));
    }
}
