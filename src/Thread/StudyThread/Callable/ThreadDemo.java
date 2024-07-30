package Thread.StudyThread.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author
 * @Date 2024/7/30 16:20
 * @Description:
 */
public class ThreadDemo {

    /*
     *  多线程的第三种实现方式：
     *      特点：可以获取到多线程运行的结果
     *
     *      1.创建一个类MyCallable实现Callable接口
     *      2.重写call（是有返回值的，表示多线程运行的结果）
     *
     *      3.创建MyCallable的对象（表示多线程要执行的任务）
     *      4.创建FutureTask的对象（作用管理多线程运行的结果）
     *      5.创建Thread类的对象，并启动（表示线程）

     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 创建MyCallable对象
        MyCallable myCallable = new MyCallable();
        // 创建FutureTask的对象
        FutureTask<Integer> ft = new FutureTask<>(myCallable);
        // 创建Thread类的对象
        Thread t = new Thread(ft);
        // 并启动
        t.start();
        // 获取结果
        Integer sum = ft.get();
        // 打印结果
        System.out.println(sum);
    }
}
