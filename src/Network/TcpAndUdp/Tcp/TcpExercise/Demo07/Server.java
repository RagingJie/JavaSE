package Network.TcpAndUdp.Tcp.TcpExercise.Demo07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/13 10:46
 * @Description: BS（接收浏览器的消息并打印）
 */
public class Server {
    /*
            客户端：不需要写
            服务器：接收数据并打印
    */

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8848);
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int len;
        while ((len = br.read()) != -1) {
            System.out.print((char) len);
        }

        serverSocket.close();
    }
}
