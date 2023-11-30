package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<User> users = new ArrayList<>();

    //初始化用户
    static {
        users.add(new User("zhangsan","123456","15144412354","155415412547845321"));
    }

    public static void main(String[] args) {
        System.out.println("================欢迎来到学生管理系统================");
        boolean flag = true;
        while (flag) {
            System.out.println("===============1登录 2注册 3忘记密码===============");
            System.out.println("请选择操作:");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            switch (index) {
                case 1 -> {
                    System.out.println("===================学生管理系统===================");
                    System.out.println("======================登录=======================");
                    flag = Login.login(users);
                    if (flag) {
                        StudentMainMenu.main();
                    }
                }
                case 2 -> {
                    System.out.println("==================请根据提示输入注册信息：==================");
                    User register = Register.register(users);
                    users.add(register);
                    printUserInfo(users);
                }
                case 3 -> {
                    System.out.println("================请根据提示进行修改密码操作================");
                    ForgetPassword.forgetPassword(users);
                    printUserInfo(users);
                }
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
