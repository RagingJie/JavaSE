package Thread.StudyThread.Runnable;

/**
 * @Author
 * @Date 2024/7/30 15:41
 * @Description:
 */
public class ThreadDemo {
    /*

        多线程的第二种启动方式：
            1.自己定义一个类实现Runnable接口
            2.重写里面的run方法
            3.创建自己的类对象
            4.创建一个Thread类的对象，并开启线程
     */

    public static void main(String[] args) {
        // 开始时间
        long start = System.currentTimeMillis();

        // 创建MyThread的对象
        // 表示多线程要执行的任务
        MyThread mt = new MyThread();

        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

        // 结束时间
        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }
}
