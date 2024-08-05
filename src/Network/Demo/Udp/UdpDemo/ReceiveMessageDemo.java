package Network.Demo.Udp.UdpDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author
 * @Date 2024/8/5 13:55
 * @Description: 使用UDP协议接收数据
 */
public class ReceiveMessageDemo {
    // 接收数据

    public static void main(String[] args) throws IOException {

        // 创建DatagramSocket接收数据
        DatagramSocket ds = new DatagramSocket(8888);

        // 接收数据字节数组，不宜设置太长，浪费资源，并导致程序卡
        byte[] bytes = new byte[1024];
        // 创建接收数据对象
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        // 该方法是阻塞的
        // 程序执行到这一步的时候，会在这里死等
        // 等发送端发送消息
        System.out.println("等待消息");
        ds.receive(dp);
        System.out.println("接收消息");

        // 解析数据
        byte[] data = dp.getData();
        int len = data.length;

        String result = new String(data, 0, len);
        int port = dp.getPort();
        InetAddress address = dp.getAddress();
        String hostAddress = address.getHostAddress();
        String hostName = address.getHostName();

        System.out.println("接收到的数据：" + result);
        System.out.println("端口号：" + port);
        System.out.println("主机地址：" + hostAddress);
        System.out.println("主机名称：" + hostName);

        // 释放资源
        ds.close();
    }
}
