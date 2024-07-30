package Thread.StudyThread.ThreadMethod.Demo03;

/**
 * @Author
 * @Date 2024/7/30 23:13
 * @Description:
 */
public class Demo03 {
    /*
            守护线程：
                final void setDaemon(boolean on)   设置为守护线程（备胎线程）
            细节：
                当其他的非守护线程执行完毕之后，守护线程会陆续结束
            通俗易懂:
                当女神线程结束了，那么备胎也没有存在的必要了
     */

    public static void main(String[] args) {
        MyThread01 mt1 = new MyThread01();
        MyThread02 mt2 = new MyThread02();

        mt1.setName("女神");
        mt2.setName("备胎");

        mt2.setDaemon(true);

        mt1.start();
        mt2.start();

    }

}
