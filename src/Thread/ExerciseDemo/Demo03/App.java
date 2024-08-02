package Thread.ExerciseDemo.Demo03;


/**
 * @Author
 * @Date 2024/8/2 11:06
 * @Description:
 */
public class App {
    /*
            有100分礼品，两人同时发送，当剩下的礼品小于10份的时候则不再送出
            利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来
    */
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("隔壁老王");
        mt2.setName("海绵宝宝");
        mt1.setPriority(1);
        mt2.setPriority(10);

        mt1.start();
        mt2.start();
    }
}
