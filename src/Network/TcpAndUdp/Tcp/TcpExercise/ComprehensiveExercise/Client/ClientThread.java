package Network.TcpAndUdp.Tcp.TcpExercise.ComprehensiveExercise.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/26 10:19
 * @Description: //创建线程，循环接收服务器发送的消息
 */
public class ClientThread implements Runnable {

    Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    // 循环接收服务器返回的数据信息
    @Override
    public void run() {
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String result = br.readLine();
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
