package Network.TcpAndUdp.Tcp.TcpExercise.ComprehensiveExercise.Client;

import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author
 * @Date 2024/8/13 14:17
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建客户端，连接服务器
        Socket socket = new Socket("Naruto", 2030);
        // 监控键盘录入
        Scanner scanner = new Scanner(System.in);
        // 请求连接服务器，服务器反馈的信息
        System.out.println("特色服务器连接成功！");
        while (true) {
            System.out.println("=====================欢迎来到Naruto聊天室=====================");
            System.out.println("1、登录");
            System.out.println("2、注册");
            System.out.println("3、退出系统");
            System.out.println("请输入您的选择：");
            Integer chooseIndex = scanner.nextInt();
            Map<String, String> map = new HashMap<>();
            map.put("option", chooseIndex.toString());
            if (chooseIndex == 1) {
                // 登录参数
                loginOrRegister(map);
                String param = JSONObject.toJSONString(map);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bw.write(param);
                bw.newLine();
                bw.flush();
                // 结束标记
                socket.shutdownOutput();
            } else if (chooseIndex == 2) {
                // 注册参数
                loginOrRegister(map);
            } else if (chooseIndex == 3) {
                // 关闭程序
                System.exit(0);
            } else {
                System.out.println("数据选项有误，请重新选择！\n");
            }
        }
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/8/13 16:51
     * @description 用户登录
     */
    public static void loginOrRegister(Map<String, String> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的账号：");
        String username = scanner.nextLine();
        map.put("username", username);
        System.out.println("请输入您的密码：");
        String password = scanner.nextLine();
        map.put("password", password);
    }
}
