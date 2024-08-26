package Network.TcpAndUdp.Tcp.TcpExercise.ComprehensiveExercise.Server;

import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author
 * @Date 2024/8/13 11:29
 * @Description: 服务器多线程
 */
public class ServerThread implements Runnable {

    private Socket socket;
    // 存储用户信息吗，用户名为键，密码为值
    private static Map<String, String> userInfos = new HashMap<>();

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 获取输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String choose = br.readLine();
                switch (choose) {
                    case "login" -> login(br);
                    case "register" -> register(br);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param br
     * @return void
     * @author Naruto
     * @date 2024/8/26 15:42
     * @description 用户注册
     */
    private void register(BufferedReader br) throws IOException {
        System.out.println("================ 用户选择了【注册】操作 ================");
        getUserInfo();
        JSONObject contentJSON = JSONObject.parseObject(br.readLine());
        String username = contentJSON.getString("username");
        if (userInfos.containsKey(username)) {
            sendClient("2");
        } else {
            String password = contentJSON.getString("password");
            String content = username + "=" + password;
            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Network\\TcpAndUdp\\Tcp\\TcpExercise\\ComprehensiveExercise\\serviceDir\\userInfo.txt", true));// 开启续写开关
            bw.newLine();
            bw.write(content);
            bw.flush();
            bw.close();
            sendClient("1");
        }
    }

    /**
     * @param br
     * @return void
     * @author Naruto
     * @date 2024/8/26 15:40
     * @description 登录
     */
    private void login(BufferedReader br) throws IOException {
        System.out.println("================ 用户选择了【登录】操作 ================");
        // 读取用户信息文件
        getUserInfo();
        JSONObject contentJSON = JSONObject.parseObject(br.readLine());
        String username = contentJSON.getString("username");
        // 判断用户信息中是否有
        if (userInfos.containsKey(username)) {
            //　有再判断是否密码正确
            boolean flag = userInfos.get(username).equals(contentJSON.getString("password"));
            if (flag) {
                // 密码正确，登录成功
                sendClient("1");
                //登录成功的时候，就需要把客户端的连接对象Socket保存起来
                Server.clients.add(socket);
                System.out.println("连入会话个数：" + Server.clients.size());
                //写一个while(){}表示正在聊天
                //接收客户端发送过来的消息，并打印在控制台
                acceptAllClientAndSend(br, username);
            } else {
                // 密码错误，登录失败
                sendClient("2");
            }
        } else {
            // 用户不存在
            sendClient("3");
        }
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/8/26 16:38
     * @description 获取用户信息
     */
    private void getUserInfo() throws IOException {
        File file = new File("src\\Network\\TcpAndUdp\\Tcp\\TcpExercise\\ComprehensiveExercise\\serviceDir\\userInfo.txt");
        BufferedReader userInfoBr = new BufferedReader(new FileReader(file));
        String len;
        while ((len = userInfoBr.readLine()) != null) {
            String[] info = len.split("=");
            String username = info[0];
            String password = info[1];
            userInfos.put(username, password);
        }
    }

    /**
     * @param br
     * @param username
     * @return void
     * @author Naruto
     * @date 2024/8/26 15:23
     * @description 接收所有客户端信息，并发送给所有连接的客户端
     */
    private void acceptAllClientAndSend(BufferedReader br, String username) throws IOException {
        while (true) {
            String content = br.readLine();
            String message = username + "发来的消息=> " + content;
            System.out.println(message);

            for (Socket client : Server.clients) {
                sendMessageToAllClient(message, client);
            }
        }
    }

    /**
     * @param message 反馈信息
     * @return void
     * @author Naruto
     * @date 2024/8/13 20:28
     * @description 给客户端发送反馈信息
     */
    private void sendClient(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }

    /**
     * @param message 反馈信息
     * @return void
     * @author Naruto
     * @date 2024/8/13 20:28
     * @description 给客户端发送反馈信息
     */
    private void sendMessageToAllClient(String message, Socket socket) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}
