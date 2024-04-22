package Http.Demo01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
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
        menu();
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        while (true) {
            switch (index) {
                case 1 -> {
                    String code = getCode();
                    System.out.println("验证码信息" + code);
                }
                case 2 -> {
                    login();
                }
                case 3 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("输入选项不存在");
                }
            }
        }

    }

    public static String sendPost(String url, String param) {
        return null;
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\"username\":\"");
        stringBuilder.append(username);
        stringBuilder.append("\",\"password\":\"");
        stringBuilder.append(password);
        stringBuilder.append("\",\"captchaCode\":\"");
        stringBuilder.append(captchaCode);
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
        System.out.println("3.退出");
    }
}
