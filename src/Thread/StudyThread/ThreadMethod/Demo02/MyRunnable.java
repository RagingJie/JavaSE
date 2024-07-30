package Thread.StudyThread.ThreadMethod.Demo02;

/**
 * @Author
 * @Date 2024/7/30 23:02
 * @Description:
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "@" + (i + 1));
        }
    }
}
