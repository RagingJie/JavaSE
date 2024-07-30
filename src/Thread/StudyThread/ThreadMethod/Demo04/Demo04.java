package Thread.StudyThread.ThreadMethod.Demo04;

/**
 * @Author
 * @Date 2024/7/30 23:40
 * @Description:
 */
public class Demo04 {
    /*

       public static void yield()       出让线程/礼让线程


    */
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("飞机");
        mt2.setName("坦克");

        mt1.start();
        mt2.start();
    }
}
