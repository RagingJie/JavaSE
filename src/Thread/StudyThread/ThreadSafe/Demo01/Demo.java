package Thread.StudyThread.ThreadSafe.Demo01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @Author
 * @Date 2024/7/31 11:01
 * @Description:
 */
public class Demo {
    /*

        需求：
            某电影目前正在上映国产大片，共有500张票，而它有三个窗口卖票，请设计一个程序模拟该电影院卖票

    */

    public static void main(String[] args) {

        MyThread window1 = new MyThread();
        MyThread window2 = new MyThread();
        MyThread window3 = new MyThread();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();


    }
}
