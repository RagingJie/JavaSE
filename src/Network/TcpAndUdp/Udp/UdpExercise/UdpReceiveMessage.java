package Network.TcpAndUdp.Udp.UdpExercise;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author
 * @Date 2024/8/5 14:57
 * @Description: 接收数据
 */
public class UdpReceiveMessage {

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(8888);

        while (true) {

            byte[] receiveArr = new byte[1024];

            DatagramPacket dp = new DatagramPacket(receiveArr, receiveArr.length);

            // 接收数据
            ds.receive(dp);

            byte[] data = dp.getData();
            int len = data.length;
            String result = new String(data, 0, len);

            InetAddress address = dp.getAddress();
            String hostAddress = address.getHostAddress();
            String hostName = address.getHostName();
            int port = dp.getPort();
//            System.out.println("接收的数据为：" + result);
//            System.out.println("该数据是从" + hostName + "(" + hostAddress + ")" + "这台电脑中的" + port + "这个端口发出的");
            System.out.println("主机名为【" + hostName + "】，ip地址为【" + hostAddress + "】，端口为：【" + port + "】的人，发送了数据：" + result);

//            if (result.trim().equals("886")) {   // 可能存在空格，所以使用trim去除空格
//                System.out.println("接收数据结束！！！");
//                break;
//            }

        }

        // 释放资源
//        ds.close();
    }
}
