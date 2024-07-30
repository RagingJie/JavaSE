package Thread.StudyThread.Thread;

/**
 * @Author
 * @Date 2024/7/30 15:49
 * @Description:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "实现多线程学习！！！");
        }
    }
}
