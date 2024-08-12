package Network.Demo.Tcp.TcpExercise.Demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * @Author
 * @Date 2024/8/12 16:47
 * @Description: 接收客户端上传的文件，上传完毕之后给出反馈，使用UUID生成图片名称
 */
public class Server {
    /*
            客户端：将本地文件上传到服务器。接收到服务器的反馈
            服务器：接收客户端上传的文件，上传完毕之后给出反馈
    */

    public static void main(String[] args) throws IOException {
        // 创建服务端，接口客户端发送的数据
        ServerSocket serverSocket = new ServerSocket(6646);
        // 图片名称
        String name = UUID.randomUUID().toString().replaceAll("-", "");
        // 输出文件地址
        File file = new File("src\\Network\\Demo\\Tcp\\TcpExercise\\Demo04\\ServerDir\\" + name + ".png");

        // 接收客户端请求
        Socket accept = serverSocket.accept();

        // 获取输入流
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        // 文件输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        //　读取速度　1MB
        byte[] readSpeed = new byte[1024 * 1024 * 1];
        while (bis.read(readSpeed) != -1) {
            bos.write(readSpeed);
        }

        // 获取输出流，反馈给客户端信息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        String content = "上传成功！";
        bw.write(content);
        bw.newLine();
        bw.flush();

        // 释放资源
        bos.close();
        serverSocket.close();
    }
}
