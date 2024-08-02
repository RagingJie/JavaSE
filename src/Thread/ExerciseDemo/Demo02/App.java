package Thread.ExerciseDemo.Demo02;

/**
 * @Author
 * @Date 2024/8/2 10:55
 * @Description:
 */
public class App {

    /*
        一共有1000张电影票，可以在两个窗口领取，假设每次领取的时间为3000毫秒
        要求：请用多线程模拟卖票过程并打印剩余电影票的数量
    */
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("窗口1");
        mt2.setName("窗口2");

        mt1.start();
        mt2.start();

    }
}
