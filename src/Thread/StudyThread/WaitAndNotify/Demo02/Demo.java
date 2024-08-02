package Thread.StudyThread.WaitAndNotify.Demo02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author
 * @Date 2024/8/2 10:32
 * @Description: 使用阻塞队列实现等待唤醒机制
 */
public class Demo {
    /*

        需求：完成生产者和消费者（等待唤醒机制）的代码
            实现线程轮流交替执行的结果

    */

    public static void main(String[] args) {

        // 创建阻塞队列对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        // 创建线程对象
        Cook cook = new Cook(queue);
        cook.setName("厨师");

        Foodie foodie = new Foodie(queue);
        foodie.setName("美食家");

        cook.start();
        foodie.start();


    }
}
