package Network.Demo.Tcp.TcpExercise.Demo06;

import java.io.*;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/13 10:35
 * @Description:
 */
public class Client {
    /*
         频繁创建线程并销毁非常浪费系统资源，所以需要用线程池优化
    */

    public static void main(String[] args) throws IOException {
        // 创建客户端，连接服务端
        Socket socket = new Socket("Naruto", 6646);
        // 获取输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 上传的文件
        File file = new File("src\\Network\\Demo\\Tcp\\TcpExercise\\Demo06\\ClientDir\\上传图片.png");
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
