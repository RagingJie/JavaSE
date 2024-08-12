package Network.Demo.Tcp.TcpExercise.Demo02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/12 15:37
 * @Description: 接收数据并打印，再给客户反馈信息
 */
public class ServerReceiveMessage {
    /*
        客户端：发送一条数据，接收服务端反馈的信息并打印
        服务器：接收数据并打印，再给客户反馈信息
    */
    public static void main(String[] args) throws IOException {
        // 创建服务端
        ServerSocket serverSocket = new ServerSocket(6666);

        // 接收客户端请求
        Socket accept = serverSocket.accept();
        // 获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        int len;
        // 读取内容
        while ((len = br.read()) != -1) {
            System.out.print((char) len);
        }

        // 写出数据
        // 细节
        // read方法从连接通道中读取数据
        // 但是，需要有一个结束标记，此处的循环才会停止
        // 否则，程序就会一直停止在read方法这里，等待读取下面的数据
        OutputStream os = accept.getOutputStream();
        String returnContent = "见到你，我也很高兴！Nice to meet you, too！" + "那你到底有多开心？";
        os.write(returnContent.getBytes());

        // 释放资源
        os.close();
        serverSocket.close();
    }
}
