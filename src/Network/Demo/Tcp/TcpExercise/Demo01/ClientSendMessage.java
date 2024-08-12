package Network.Demo.Tcp.TcpExercise.Demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author
 * @Date 2024/8/12 15:37
 * @Description: 多次发送数据
 */
public class ClientSendMessage {
    /*
        客户端：多次发送数据
        服务器：接收多次数据，并打印
    */
    public static void main(String[] args) throws IOException {
        // 创建客户端
        Socket socket = new Socket("Naruto", 6666);
        // 获取输出流
        OutputStream os = socket.getOutputStream();
        // 输入内容
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 内容
            System.out.println("请输入发送内容：");
            String text = scanner.nextLine();
            os.write(text.getBytes());
            os.flush();
            if (text.equals("886")) break;
        }

        // 释放资源
        os.close();

    }
}
