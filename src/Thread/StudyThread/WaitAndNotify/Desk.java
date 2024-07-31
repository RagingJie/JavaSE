package Thread.StudyThread.WaitAndNotify;

/**
 * @Author
 * @Date 2024/7/31 23:29
 * @Description:
 */
public class Desk {

    /*

        作用：
            控制生产者与消费者的执行

    */

    // 是否有面条，0：没有面条，1：右面条
    public static int foodFlag = 0;

    // 总个数
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();
}
