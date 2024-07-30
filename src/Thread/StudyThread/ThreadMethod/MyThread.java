package Thread.StudyThread.ThreadMethod;

/**
 * @Author
 * @Date 2024/7/30 17:17
 * @Description:
 */
public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                sleep(1000);  // 因为run方法在父类中没有抛出异常，所以子类不能抛出异常，只能捕获异常
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "@" + i);
        }
    }
}
