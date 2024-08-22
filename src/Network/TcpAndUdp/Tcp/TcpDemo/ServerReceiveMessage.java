package Network.TcpAndUdp.Tcp.TcpDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/5 15:45
 * @Description: 使用TCP协议接收数据
 */
public class ServerReceiveMessage {
    public static void main(String[] args) throws IOException {

        // 1.创建服务器端的Socket对象(ServerSocket)
        ServerSocket serverSocket = new ServerSocket(8848);

        // 2.监听客户端连接，返回一个Socket对象
        Socket socket = serverSocket.accept();

        // 3.获取输入流，读数据，并把他数据显示在控制台
        /*InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int len;
        while ((len = br.read()) != -1) {
            System.out.print((char) len);
        }

        // 4.释放资源
        socket.close();
        serverSocket.close();
    }
}
