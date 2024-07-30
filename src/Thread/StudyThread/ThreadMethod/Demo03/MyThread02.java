package Thread.StudyThread.ThreadMethod.Demo03;

/**
 * @Author
 * @Date 2024/7/30 23:12
 * @Description:
 */
public class MyThread02 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + "@" + i);
        }
    }
}
