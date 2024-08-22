package Network.TcpAndUdp.Tcp.TcpExercise.ComprehensiveExercise.Server;

import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.Socket;
import java.util.Map;

/**
 * @Author
 * @Date 2024/8/13 11:29
 * @Description: 服务器多线程
 */
public class ServerThread implements Runnable {

    private Socket socket;
    private Map<String, String> userInfos;

    public ServerThread(Socket socket, Map<String, String> userInfos) {
        this.socket = socket;
        this.userInfos = userInfos;
    }

    @Override
    public void run() {
        try {
            // 获取输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String content = br.readLine();
            if (content == null) return;

            JSONObject contentJSON = JSONObject.parseObject(content);
            String type = contentJSON.getString("type");
            if ("1".equals(type.trim())) {
                // 登录处理
                String username = contentJSON.getString("username");
                // 判断用户信息中是否有
                if (userInfos.containsKey(username)) {
                    //　有再判断是否密码正确
                    boolean flag = userInfos.get(username).equals(contentJSON.getString("password"));
                    if (flag) {
                        // 密码正确，登录成功
                        sendClient("登录成功");
                    } else {
                        // 密码错误，登录失败
                        sendClient("登录失败");
                    }
                } else {
                    // 用户不存在
                    sendClient("用户不存在");
                }
            } else if ("2".equals(type.trim())) {
                // 注册处理
            } else {
                // 未知处理
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

    /**
     * @param message 反馈信息
     * @return void
     * @author Naruto
     * @date 2024/8/13 20:28
     * @description 给客户端发送反馈信息
     */
    private void sendClient(String message) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(message);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
