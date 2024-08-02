package Thread.StudyThread.WaitAndNotify.Demo02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author
 * @Date 2024/8/2 10:32
 * @Description:
 */
public class Foodie extends Thread {

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
