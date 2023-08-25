package String;

import java.util.Scanner;

/**
 * 已知用户名和密码。
 * 请用程序实现抹蜜用户登录
 * 总共给三次机会，登录之后，给出相应的提示
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String inputUsername = scanner.next();
            System.out.println("请输入密码：");
            String inputPassword = scanner.next();
            if (username.equals(inputUsername) && password.equals(inputPassword)){
                System.out.println("登录成功！");
                break;
            }else {
                System.out.println();
                System.out.println("用户名或密码不正确！");
                System.out.println();
                if (i==2){
                }else {
                    System.out.println("*****************************");
                    System.out.println("请重新输入用户名与密码~~~");
                }
            }
        }
    }

}
