package Network.TcpAndUdp.Tcp.TcpExercise.ComprehensiveExercise.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @Author
 * @Date 2024/8/13 11:28
 * @Description: 服务器
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 读取用户信息文件
        File file = new File("src\\Network\\Demo\\Tcp\\TcpExercise\\ComprehensiveExercise\\serviceDir\\userInfo.txt");
        BufferedReader userInfoBr = new BufferedReader(new FileReader(file));
        // 存储用户信息吗，用户名为键，密码为值
        Map<String, String> userInfos = new HashMap<>();
        String len;
        while ((len = userInfoBr.readLine()) != null) {
            String[] info = len.split("=");
            String username = info[0];
            String password = info[1];
            userInfos.put(username, password);
        }

        // 创建服务器
        ServerSocket ss = new ServerSocket(2030);
        // 存放所有的客户端链接
        ArrayList<Socket> clients = new ArrayList<>();

        // 自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, // 核心线程数量，不能小于0
                16, // 最大线程数，不能小于0，最大数量 >= 核心线程数量
                60, // 空闲线程最大存活时间，不能小于0
                TimeUnit.SECONDS, // 时间单位，用TimeUnit指定
                new ArrayBlockingQueue<>(13), // 任务队列（阻塞队列）
                Executors.defaultThreadFactory(),  // 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()  // 任务的拒绝策略
        );

        while (true) {
            // 接收客户端信息
            Socket socket = ss.accept();
            // 创建任务提交给线程池
            pool.submit(new ServerThread(socket, userInfos));
        }
    }
}
