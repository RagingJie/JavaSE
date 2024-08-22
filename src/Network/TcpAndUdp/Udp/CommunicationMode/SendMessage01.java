package Network.TcpAndUdp.Udp.CommunicationMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @Author
 * @Date 2024/8/6 0:02
 * @Description: 组播
 */
public class SendMessage01 {
    public static void main(String[] args) throws IOException {

        // 创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket();

        String data = "这里是【组播】发送的数据！！！";
        byte[] bytes = data.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("224.0.0.1"), 10000);

        // 发送数据
        ms.send(dp);

        // 释放资源
        ms.close();
    }
}
