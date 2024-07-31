package Thread.StudyThread.ThreadSafe.LockDead;

/**
 * @Author
 * @Date 2024/7/31 17:06
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {

        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("线程A");
        mt2.setName("线程B");

        mt1.start();
        mt2.start();
    }
}
