package Network.TcpAndUdp.Udp.UdpDemo;

import java.io.IOException;
import java.net.*;

/**
 * @Author
 * @Date 2024/8/5 11:34
 * @Description: 使用UDP协议发送数据
 */
public class SendMessageDemo {
    // 发送数据
    public static void main(String[] args) throws IOException {

        // 创建DatagramSocket对象（快递公司）
        // 细节：
        // 绑定端口，以后我们就是通过这个端口往外发送
        // 空参：所有可用的端口中随机一个进行使用
        // 有参：指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket();

        // 打包数据
        String data = "你好啊，朋友，最近过的怎么样啊？";
        byte[] sendData = data.getBytes();
        InetAddress address = InetAddress.getByName("Naruto");
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(sendData, sendData.length, address, port);

        // 发送数据
        ds.send(dp);

        // 释放资源
        ds.close();
    }
}
