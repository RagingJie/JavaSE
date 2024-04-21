package Thread.Demo01;

/**
 * @Author
 * @Date 2024/4/11 13:49
 * @Description: 多线程：同时完成多项任务
 */
public class MoreThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println(1);
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println(2);
            }
        };

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                System.out.println(3);
            }
        };

        Thread thread4 = new Thread() {
            @Override
            public void run() {
                System.out.println(4);
            }
        };

        Thread thread5 = new Thread() {
            @Override
            public void run() {
                System.out.println(5);
            }
        };

        Thread thread6 = new Thread() {
            @Override
            public void run() {
                System.out.println(6);
            }
        };

        Thread thread7 = new Thread() {
            @Override
            public void run() {
                System.out.println(7);
            }
        };

        Thread thread8 = new Thread() {
            @Override
            public void run() {
                System.out.println(8);
            }
        };


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
    }
}
