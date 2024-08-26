package Network.TcpAndUdp.Tcp.TcpExercise.ComprehensiveExercise.Client;

import Network.TcpAndUdp.Tcp.TcpExercise.ComprehensiveExercise.Server.Server;
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
    public static void main(String[] args) throws IOException, InterruptedException {
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
            if (chooseIndex == 1) {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                // 登录操作
                bw.write("login");
                bw.newLine();
                bw.flush();
                // 输入登录参数
                loginOrRegister(map);
                String param = JSONObject.toJSONString(map);
                // 请求登录
                bw.write(param);
                bw.newLine();
                bw.flush();

                // 获取登录结果
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String loginResult = br.readLine();
                if ("1".equals(loginResult)) {
                    // 登录成功
                    System.out.println("===================== 登录成功，开始聊天 =====================");
                    //开一条单独的线程，专门用来接收服务端发送过来的聊天记录（都扔到线程池里面去）
                    Server.pool.submit(new ClientThread(socket));
                    talkToAll(bw);
                } else if ("2".equals(loginResult)) {
                    // 密码错误
                    System.out.println("密码错误");
                } else {
                    // 用户名不存在
                    System.out.println("用户名不存在");
                }

            } else if (chooseIndex == 2) {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                // 注册操作
                bw.write("register");
                bw.newLine();
                bw.flush();
                // 输入注册参数
                loginOrRegister(map);
                String param = JSONObject.toJSONString(map);
                // 请求注册
                bw.write(param);
                bw.newLine();
                bw.flush();

                // 获取注册结果
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String registerResult = br.readLine();
                if ("1".equals(registerResult)) {
                    // 注册成功
                    System.out.println("注册成功");
                } else if ("2".equals(registerResult)) {
                    // 用户名已存在
                    System.out.println("用户名已存在");
                } else {
                    // 注册失败
                    System.out.println("注册失败");
                }
            } else if (chooseIndex == 3) {
                // 关闭程序
                System.exit(0);
            } else {
                System.out.println("数据选项有误，请重新选择！\n");
            }
        }
    }

    /**
     * @param bw
     * @return void
     * @author Naruto
     * @date 2024/8/26 14:32
     * @description 与所有连接服务器的客户端聊天（保证是一条输出流）
     */
    private static void talkToAll(BufferedWriter bw) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入您需要说的话：");
            String content = scanner.nextLine();
            // 将聊天内容发送给服务器
            bw.write(content);
            bw.newLine();
            bw.flush();
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
