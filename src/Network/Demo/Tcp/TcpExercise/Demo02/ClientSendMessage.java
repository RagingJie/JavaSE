package Network.Demo.Tcp.TcpExercise.Demo02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author
 * @Date 2024/8/12 15:37
 * @Description:
 */
public class ClientSendMessage {
    /*
        客户端：发送一条数据，接收服务端反馈的信息并打印
        服务器：接收数据并打印，再给客户反馈信息
    */
    public static void main(String[] args) throws IOException {
        // 创建客户端
        Socket socket = new Socket("Naruto", 6666);
        // 获取输出流
        OutputStream os = socket.getOutputStream();

        // 内容
        String text = "见到您，我很高兴！Nice to meet you!";
        os.write(text.getBytes());

        // 结束标记输出
        socket.shutdownOutput();

        // 获取输入流，服务端返回的信息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int len;
        while ((len = br.read()) != -1) {
            System.out.print((char) len);
        }

        // 释放资源
        br.close();
        os.close();

    }
}
