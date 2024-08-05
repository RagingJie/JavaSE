package Network.Demo.Tcp.TcpDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author
 * @Date 2024/8/5 15:44
 * @Description: 使用TCP协议发送数据
 */
public class ClientSendMessage {

    public static void main(String[] args) throws IOException {

        // 1.创建客户端的Socket对象（Socket）与指定服务端连接
        // 细节：在创建对象的同时会连接服务端
        //      如果连接不上，代码会报错
        Socket socket = new Socket("Naruto", 8848);

        // 2.获取输出流，写数据
        OutputStream os = socket.getOutputStream();
        os.write("我是帅锅！！！".getBytes());

        // 释放资源
        os.close();
        socket.close();

    }
}
