package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static boolean login(ArrayList<User> users) {
        int count = 0;
        while (true) {
            String captcha = VerificationCodeUtil.createCaptcha();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = scanner.next();
            if (!checkUsername(username, users)) {
                System.out.println("该用户还未注册，请先注册~");
                return false;
            }
            System.out.println("请输入密码：");
            String password = scanner.next();
            System.out.println("验证码：" + captcha);
            while (true) {
                System.out.println("请输入验证码：");
                String c = scanner.next();
                if (!c.equalsIgnoreCase(captcha)) {
                    System.out.println("验证码输入有误，请重新输入~");
                } else {
                    break;
                }
            }
            if (checkPassword(username, password, users)) {
                break;
            } else {
                count++;
                System.out.println("用户名或密码不正确~，还有" + (3 - count) + "次机会~");
            }
            if (count == 3) return false;
        }
        return true;
    }

    /**
     * 校验用户是否存在
     *
     * @param users
     * @return
     */
    public static boolean checkUsername(String username, ArrayList<User> users) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 校验用户密码
     *
     * @param usename
     * @param password
     * @param users
     * @return
     */
    private static boolean checkPassword(String usename, String password, ArrayList<User> users) {
        for (User user : users) {
            if (usename.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
