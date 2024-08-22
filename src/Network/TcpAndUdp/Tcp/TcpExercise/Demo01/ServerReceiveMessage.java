package Network.TcpAndUdp.Tcp.TcpExercise.Demo01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/12 15:37
 * @Description: 接收多次数据，并打印
 */
public class ServerReceiveMessage {
    /*
        客户端：多次发送数据
        服务器：接收多次数据，并打印
    */
    public static void main(String[] args) throws IOException {
        // 创建服务端
        ServerSocket serverSocket = new ServerSocket(6666);

        // 接收客户端请求
        Socket accept = serverSocket.accept();
        System.out.println("收到链接请求");
        // 获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        int len;
        // 读取内容
        while ((len = br.read()) != -1) {
            System.out.print((char) len);
        }

        // 释放资源
        serverSocket.close();
    }
}
