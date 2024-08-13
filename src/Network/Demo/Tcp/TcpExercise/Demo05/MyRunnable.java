package Network.Demo.Tcp.TcpExercise.Demo05;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @Author
 * @Date 2024/8/13 10:16
 * @Description:
 */
public class MyRunnable implements Runnable {

    private Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 图片名称
        String name = UUID.randomUUID().toString().replaceAll("-", "");
        // 输出文件地址
        File file = new File("src\\Network\\Demo\\Tcp\\TcpExercise\\Demo05\\ServerDir\\" + name + ".png");

        try {
            // 获取输入流
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            // 文件输出流
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            //　读取速度　1MB
            byte[] readSpeed = new byte[1024 * 1024 * 1];
            while (bis.read(readSpeed) != -1) {
                bos.write(readSpeed);
            }
            // 获取输出流，反馈给客户端信息
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String content = "上传成功！";
            bw.write(content);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
