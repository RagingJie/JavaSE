package Http.Demo01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * @Author
 * @Date 2024/4/21 15:45
 * @Description: http发送post请求练习
 */
public class SendPostHttpDemo02 {

    private final static String LOGIN_URL = "http://127.0.0.1:9123/backendApi/login/doLogin";
    private final static String GET_CODE_URL = "http://127.0.0.1:9123/clientApi/captcha/getCode";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            menu();
            System.out.print("请输入选项序号：");
            int index = scanner.nextInt();
            switch (index) {
                case 1 -> {
                    String code = getCode();
                    System.out.println("验证码信息：" + code);
                }
                case 2 -> {
                    String loginInfo = login();
                    System.out.println("登录返回信息：" + loginInfo);
                }
                case 3 -> {
                }
                case 4 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println();
                    System.out.println("******************************");
                    System.out.println("输入选项不存在，请重新输入选项序号");
                    System.out.println("******************************");
                }
            }
        }

    }

    public static String sendPost(String url, String param) {
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 建立连接
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            // 请求方法
            connection.setRequestMethod("POST");
            // 设置请求属性
            connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");

            // 允许写出
            connection.setDoOutput(true);
            // 允许读入
            connection.setDoInput(true);

            // 根据连接获取输出流对象，将参数写入到连接中
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            // 写入
            out.print(param);
            // 刷新
            out.flush();

            // 定义 BufferedReader 输入流，来读取url的相应
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader in = new BufferedReader(inputStreamReader);

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

            in.close();
            inputStreamReader.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String sendGet(String url, String param) {
        String result = "";
        String urlName = url + param;
        try {
            URL requestUrl = new URL(urlName);
            HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
            urlConnection.setRequestMethod("GET");
            // application/json; charset=utf-8
            urlConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            InputStreamReader inputStream = new InputStreamReader(urlConnection.getInputStream());
            BufferedReader in = new BufferedReader(inputStream);

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

            in.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        System.out.print("请输入验证码：");
        String captchaCode = scanner.next();
        System.out.print("请输入uuid：");
        String uuid = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\"username\":\"");
        stringBuilder.append(username);
        stringBuilder.append("\",\"password\":\"");
        stringBuilder.append(password);
        stringBuilder.append("\",\"captchaCode\":\"");
        stringBuilder.append(captchaCode);
        stringBuilder.append("\",\"uuid\":\"");
        stringBuilder.append(uuid);
        stringBuilder.append("\"");

        stringBuilder.append("}");
        String param = stringBuilder.toString();
        System.out.println(param);

        return sendPost(LOGIN_URL, param);
    }

    public static String getCode() {
        return sendGet(GET_CODE_URL, "");
    }

    public static void menu() {
        System.out.println("======菜单======");
        System.out.println("1.获取图形验证码");
        System.out.println("2.登录");
        System.out.println("3.显示菜单");
        System.out.println("4.退出");
    }
}
