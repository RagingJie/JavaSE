package Thread.StudyThread.WaitAndNotify;

/**
 * @Author
 * @Date 2024/7/31 23:31
 * @Description:
 */
public class Foodie extends Thread {

    /*
     * 1.循环
     * 2.同步代码块
     * 3.判断共享数据是否到了末尾（到了末尾）
     * 4.判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
     */

    @Override
    public void run() {
        while (true) {
            // 同步代码块
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 先判断桌子上是否有面条
                    if (Desk.foodFlag == 0) {
                        try {
                            // 如果没有，就等待
                            Desk.lock.wait();  // 让当前线程和锁进行绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 把吃的总数-1
                        Desk.count--;
                        // 如果有，就开吃
                        System.out.println(getName() + "在吃面条，还能再吃" + Desk.count + "碗！！！");
                        // 吃完后，唤醒厨师继续做
                        Desk.lock.notifyAll();
                        // 修改桌子的状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
