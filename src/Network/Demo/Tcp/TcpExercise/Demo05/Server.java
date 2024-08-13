package Network.Demo.Tcp.TcpExercise.Demo05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/13 9:16
 * @Description: 上传文件（多线程版）
 */
public class Server {
    /*
            想要服务器不停止，能接收很多用户上传的图片
            该怎么做呢？
            提示：可以用循环或者多线程
            但是循环不合理，最优解法（循环+多线程）改写
    */

    public static void main(String[] args) throws IOException {

        // 创建服务器对象，接收客户端的请求
        ServerSocket serverSocket = new ServerSocket(6646);

        while (true) {
            // 接收连接请求
            Socket socket = serverSocket.accept();
            // 开启服务
            new Thread(new MyRunnable(socket)).start();
        }
    }
}
