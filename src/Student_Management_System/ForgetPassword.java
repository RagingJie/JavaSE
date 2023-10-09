package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class ForgetPassword {
    /**
     * 忘记密码
     *
     * @param users
     */
    public static void forgetPassword(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        if (Login.checkUsername(username, users)) {
            System.out.println("请输入身份证号：");
            String identityCard = scanner.next();
            System.out.println("请输入手机号：");
            String phoneNumber = scanner.next();
            if (checkIdentityCard(username, identityCard, phoneNumber, users)) {
                System.out.println("验证成功，请输入新密码：");
                String newPassword = scanner.next();
                changePassword(username, newPassword, users);
            }else {
                System.out.println("验证失败，手机后或身份证号不正确~");
            }
        } else {
            System.out.println("该用户未注册！请先注册~~~");
        }
    }

    /**
     * 校验身份证号
     *
     * @param username
     * @param identityCard
     * @param users
     * @return
     */
    private static boolean checkIdentityCard(String username, String identityCard, String phoneNumber, ArrayList<User> users) {
        for (User user : users) {
            boolean flag = username.equals(user.getUsername()) && identityCard.equals(user.getIdentityCard()) && phoneNumber.equals(user.getPhoneNumber());
            if (flag) {
                return true;
            }
        }
        return false;
    }

    /**
     * 修改密码，忘记密码的操作
     *
     * @param username
     * @param newPassword
     * @param users
     */
    private static void changePassword(String username, String newPassword, ArrayList<User> users) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                user.setPassword(newPassword);
            }
        }
    }
}
