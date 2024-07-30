package Thread.StudyThread.ThreadMethod.Demo05;

import javax.swing.plaf.TableHeaderUI;

/**
 * @Author
 * @Date 2024/7/30 23:47
 * @Description:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@" + (i + 1));
        }
    }
}
