package Thread.StudyThread.ThreadSafe.Lock;

/**
 * @Author
 * @Date 2024/7/31 16:32
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("张三");
        mt2.setName("李四");
        mt3.setName("王五");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
