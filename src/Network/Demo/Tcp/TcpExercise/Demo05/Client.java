package Network.Demo.Tcp.TcpExercise.Demo05;

import java.io.*;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/13 9:16
 * @Description: 上传文件（多线程版）
 */
public class Client {
    /*
            想要服务器不停止，能接收很多用户上传的图片
            该怎么做呢？
            提示：可以用循环或者多线程
            但是循环不合理，最优解法（循环+多线程）改写
    */

    public static void main(String[] args) throws IOException {
        // 创建客户端，连接服务端
        Socket socket = new Socket("Naruto", 6646);
        // 获取输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 上传的文件
        File file = new File("src\\Network\\Demo\\Tcp\\TcpExercise\\Demo05\\ClientDir\\上传图片.png");
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
