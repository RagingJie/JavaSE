package Thread.StudyThread.ThreadMethod.Demo04;

/**
 * @Author
 * @Date 2024/7/30 23:41
 * @Description:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "@" + (i + 1));

            // 表示出让当前CPU执行权
            Thread.yield();   // 是结果尽可能均匀一点
        }
    }
}
