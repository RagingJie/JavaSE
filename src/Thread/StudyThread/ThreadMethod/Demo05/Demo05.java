package Thread.StudyThread.ThreadMethod.Demo05;

/**
 * @Author
 * @Date 2024/7/30 23:46
 * @Description:
 */
public class Demo05 {

    /*
            public static void join()         插入线程/插队线程
    */
    public static void main(String[] args) throws InterruptedException {

        MyThread mt = new MyThread();
        mt.setName("土豆");
        mt.start();

        // 表示把mt这个线程，插入到当前线程之前
        // mt：土豆
        // 当前线程：main线程
        mt.join();


        // 执行main线程当中的
        for (int i = 1; i <= 10; i++) {
            System.out.println("main线程" + "@" + i);
        }
    }
}
