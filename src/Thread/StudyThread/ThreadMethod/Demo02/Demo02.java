package Thread.StudyThread.ThreadMethod.Demo02;

/**
 * @Author
 * @Date 2024/7/30 23:00
 * @Description:
 */
public class Demo02 {
    /*

    setPriority(int newPriority)      设置线程的优先级
    final int getPriority()           获取线程的优先级

    */
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "坦克");

//        System.out.println(t1.getPriority());  // 默认是5
//        System.out.println(t2.getPriority());  // 默认是5
//        System.out.println(Thread.currentThread().getPriority());  // 默认是5

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

    }
}
