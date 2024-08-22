package Network.TcpAndUdp.Tcp.TcpExercise.Demo03;

import java.io.*;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/12 16:44
 * @Description: 将本地文件上传到服务器。接收到服务器的反馈
 */
public class Client {
    /*
            客户端：将本地文件上传到服务器。接收到服务器的反馈
            服务器：接收客户端上传的文件，上传完毕之后给出反馈
    */

    public static void main(String[] args) throws IOException {
        // 创建客户端，连接服务端
        Socket socket = new Socket("Naruto", 6646);
        // 获取输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 上传的文件
        File file = new File("src\\Network\\Demo\\Tcp\\TcpExercise\\Demo03\\ClientDir\\上传图片.png");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        //　读取速度　1MB
        byte[] readSpeed = new byte[1024 * 1024 * 1];
        while (bis.read(readSpeed) != -1) {
            bos.write(readSpeed, 0, readSpeed.length);
        }

        // 写出一个结束标志
        socket.shutdownOutput();

        // 获取服务端反馈的信息
        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = isr.readLine();
        System.out.println("服务端返回结果：" + result);

        // 释放资源
        bis.close();
        socket.close();
    }
}
