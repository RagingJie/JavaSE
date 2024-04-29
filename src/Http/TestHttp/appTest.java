package Http.TestHttp;

import Http.HttpUtil.HttpRequest;

import java.util.Scanner;

/**
 * @Author Naruto
 * @Date 2024/4/29 10:55
 * @Description: 发送http请求
 */
public class appTest {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            menu();
            System.out.print("请输入选项序号：");
            int index = scanner.nextInt();
            switch (index) {
                case 1 -> {
                    String result = sendGet();
                    System.out.println("发送《get》请求返回结果信息：" + result);
                }
                case 2 -> {
                    String result = sendPost();
                    System.out.println("发送《post》请求返回结果信息：" + result);
                }
                case 3 -> {
                    System.exit(0);
                    scanner.close();
                    System.out.println("系统已退出");
                }
                default -> System.out.println("输入选项错误，请重新输入选项！");
            }
        }

    }

    private static void menu() {
        System.out.println();
        System.out.println("*******操作菜单*******");
        System.out.println("1. 发送get请求");
        System.out.println("2. 发送post请求");
        System.out.println("3. 退出系统");
        System.out.println("********************");
    }

    /**
     * @return java.lang.String
     * @author Naruto
     * @date 2024/4/29 11:10
     * @description 发送get请求
     */
    private static String sendGet() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n"); // 设置分隔符为换行符，允许输入包含空格
        System.out.println();
        System.out.println("注：系统会自动在请求路径上添加《http://》，书写请求地址时无需书写");
        System.out.print("请输入请求地址：");
        String url = "http://" + scanner.next();
        System.out.print("请输入请求参数：");
        String param = scanner.next();

        return HttpRequest.executeGet(url, param);
    }

    /**
     * @return java.lang.String
     * @author Naruto
     * @date 2024/4/29 11:11
     * @description 发送post请求
     */
    private static String sendPost() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n"); // 设置分隔符为换行符，允许输入包含空格
        System.out.println();
        System.out.println("注：系统会自动在请求路径上添加《http://》，书写请求地址时无需书写");
        System.out.print("请输入请求地址：");
        String url = "http://" + scanner.next();
        System.out.print("请输入请求参数：");
        String param = scanner.next();

        return HttpRequest.executeGet(url, param);
    }

}
