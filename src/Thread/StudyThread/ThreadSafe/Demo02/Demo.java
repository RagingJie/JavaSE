package Thread.StudyThread.ThreadSafe.Demo02;

/**
 * @Author
 * @Date 2024/7/31 16:09
 * @Description:
 */
public class Demo {

    /*

        需求：
            某电影目前正在上映国产大片，共有500张票，而它有三个窗口卖票，请设计一个程序模拟该电影院卖票
            利用同步方法完成
            技巧：同步代码块

    */

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口①");
        t2.setName("窗口②");
        t3.setName("窗口③");

        t2.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}
