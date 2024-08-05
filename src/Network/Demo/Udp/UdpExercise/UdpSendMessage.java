package Network.Demo.Udp.UdpExercise;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Author
 * @Date 2024/8/5 14:57
 * @Description: 发送数据
 */
public class UdpSendMessage {

       /*
            《聊天室》练习：
            按照下面的要求实现程序
            UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
            UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
       */

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        // 创建监听键盘录入对象
        Scanner scanner = new Scanner(System.in);

        // 无限循环，达到要求结束发送数据
        while (true) {

            System.out.println("请输入发送的数据：");
            String data = scanner.nextLine();

            byte[] bytes = data.getBytes();
            // 本机地址
            InetAddress address = InetAddress.getByName("Naruto");
            // 发送到指定的端口
            int port = 8888;

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            // 发送数据
            ds.send(dp);

            // 直到输入的数据是886，发送数据结束
            if (data.equals("886")) {
                System.out.println("发送数据结束！！！");
                break;
            }
        }

        // 释放资源
        ds.close();

    }
}
