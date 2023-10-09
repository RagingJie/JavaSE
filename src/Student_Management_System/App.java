package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("X:" + (int) 'X' + "， x:" + (int) 'x');
        ArrayList<User> users = new ArrayList<>();
        String captcha = VerificationCodeUtil.createCaptcha();
        System.out.println("验证码为：" + captcha);
        System.out.println("================欢迎来到学生管理系统================");
        boolean flag = true;
        while (flag) {
            System.out.println("===============1登录 2注册 3忘记密码===============");
            System.out.println("请选择操作:");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            switch (index) {
                case 1 -> System.out.println("登录");
                case 2 -> {
                    System.out.println("======请根据提示输入注册信息：======");
                    User register = Register.register(users);
                    users.add(register);
                    printUserInfo(users);
                }
                case 3 -> System.out.println("忘记密码？");
                default -> {
                    System.out.println("没有此选项，系统即将退出......");
                    flag = false;
                }
            }
        }
    }

    /**
     * 打印所有的用户信息
     *
     * @param users
     */
    private static void printUserInfo(ArrayList<User> users) {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

}
