package Network.TcpAndUdp.Tcp.TcpExercise.Demo06;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author
 * @Date 2024/8/13 10:35
 * @Description: 上传文件（线程池优化）
 */
public class Server {
    /*
         频繁创建线程并销毁非常浪费系统资源，所以需要用线程池优化
    */

    public static void main(String[] args) throws IOException {
        // 创建服务器对象，接收客户端发送的请求
        ServerSocket serverSocket = new ServerSocket(6646);
        // 创建固定线程个数的线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);

        while (true) {
            // 接收客户端发送的请求
            Socket socket = serverSocket.accept();
            pool.submit(new MyRunnable(socket));
        }
    }
}
