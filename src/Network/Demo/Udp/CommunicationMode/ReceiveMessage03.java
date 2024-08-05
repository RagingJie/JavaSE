package Network.Demo.Udp.CommunicationMode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @Author
 * @Date 2024/8/6 0:03
 * @Description:
 */
public class ReceiveMessage03 {
    public static void main(String[] args) throws IOException {

        // 1.创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket(10000);

        // 2.将当前本机，添加到224.0.0.1的这一组当中
        InetAddress address = InetAddress.getByName("224.0.0.2");
        ms.joinGroup(address);

        // 3.创建DatagramPacket数据包对象
        byte[] arr = new byte[1024];
        DatagramPacket dp = new DatagramPacket(arr, arr.length);

        // 4.接收数据
        ms.receive(dp);

        // 5.解析数据
        byte[] data = dp.getData();
        int len = data.length;
        String result = new String(data, 0, len);
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();
        int port = dp.getPort();

        System.out.println("主机名为【" + name + "】，ip地址为【" + ip + "】，端口为：【" + port + "】的人，发送了数据：" + result);

        // 6.释放资源
        ms.close();
    }
}
