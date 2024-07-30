package Thread.StudyThread.Thread;

/**
 * @Author
 * @Date 2024/7/30 15:41
 * @Description:
 */
public class ThreadDemo {

    /**
     * 多线程的第一种启动方式
     *      1.自己定义一个类继承Thread
     *      2.重写run方法
     *      3.创建子类的对象，并启动线程
     *
     */

    public static void main(String[] args) {
        // 开始时间
        long start = System.currentTimeMillis();

        MyThread mt1 = new MyThread();
        mt1.setName("线程1");
        mt1.start();
        MyThread mt2 = new MyThread();
        mt2.setName("线程2");
        mt2.start();

        // 结束时间
        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }
}
