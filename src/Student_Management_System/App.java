package Student_Management_System;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String captcha = VerificationCodeUtil.createCaptcha();
        System.out.println("验证码为："+captcha);
        System.out.println("================欢迎来到学生管理系统================");
        System.out.println("===============1登录 2注册 3忘记密码===============");
        System.out.println("请选择操作:");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        switch (index){
            case 1 -> System.out.println("登录");
            case 2 -> System.out.println("注册");
            case 3 -> System.out.println("忘记密码？");
            default -> System.out.println("没有此选项，请重新选择~");
        }
    }
}
