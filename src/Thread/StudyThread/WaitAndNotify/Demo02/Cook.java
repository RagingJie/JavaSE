package Thread.StudyThread.WaitAndNotify.Demo02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author
 * @Date 2024/8/2 10:32
 * @Description:
 */
public class Cook extends Thread {

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println(getName() + "做了一碗面条！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
