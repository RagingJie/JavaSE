package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    /**
     * 注册用户
     * 设置为 public 方便外部访问此方法
     * @param users
     * @return
     */
    public static User register(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        //用户名
        while (true) {
            System.out.println("请输入用户名（用户名长度为3~15，必须由数字与字母组成！！）：");
            String username = scanner.next();
            if (!checkUser(username, users) && checkUsername(username)) {
                user.setUsername(username);
                break;
            } else if (!checkUsername(username)) {
                System.out.println("输入的用户名不合法（用户名长度为3~15，必须由数字与字母组成！！），请仔细检查后，重新输入~");
            } else if (checkUser(username, users)) {
                System.out.println("该用户名已经存在！！！");
            }
        }
        //密码
        while (true) {
            System.out.println("请输入密码（密码长度3~12）：");
            String password1 = scanner.next();
            if (checkPassword(password1)) {
                System.out.println("请再次输入密码（密码长度3~12）：");
                String password2 = scanner.next();
                if (checkPassword(password2)) {
                    if (password1.equals(password2)) {
                        user.setPassword(password1);
                        break;
                    } else {
                        System.out.println("两次输入密码不一致~");
                    }
                } else {
                    System.out.println("输入的密码不合法（密码长度3~12），请仔细检查后重新输入~~");
                }
            } else {
                System.out.println("输入的密码不合法（密码长度3~12），请仔细检查后重新输入~~");
            }
        }
        //身份证号
        while (true) {
            System.out.println("请输入身份证号：");
            String identityCard = scanner.next();
            if (checkIdentityCard(identityCard)) {
                user.setIdentityCard(identityCard);
                break;
            } else {
                System.out.println("输入的身份证格式有误，请仔细检查后重新输入：");
            }
        }
        //手机号
        while (true) {
            System.out.println("请输入手机号：");
            String phoneNumber = scanner.next();
            if (!checkFigure(phoneNumber)) {
                user.setPhoneNumber(phoneNumber);
                break;
            } else {
                System.out.println("输入的手机号不合法~~~");
            }
        }
        return user;
    }

    /**
     * 校验用户名是否存在
     *
     * @param username
     * @param users
     * @return 用户名存在时返回true，反之返回false
     */
    private static boolean checkUser(String username, ArrayList<User> users) {
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 校验手机号是否包含的全部是数字以及首位不是 0  长度必须为11位
     *
     * @return 当有存在其他类型数据时，返回true，否则返回false
     */
    private static boolean checkFigure(String phoneNumber) {
        //校验长度11
        if (phoneNumber.length() != 11) {
            return true;
        }
        //校验数字与首位
        for (int i = 0; i < phoneNumber.length(); i++) {
            int number = phoneNumber.charAt(i);
            if (i == 0 && number == 48) {
                return true;
            }
            if (number < 48 || number > 57) {
                return true;
            }
        }
        return false;
    }

    /**
     * 校验用户名合法性
     *
     * @param username
     * @return
     */
    private static boolean checkUsername(String username) {
        if (username.length() < 3 || username.length() > 15) return false;
        int count1 = 0;  //记录数字的个数
        int count2 = 0;  //记录字母的个数
        for (int i = 0; i < username.length(); i++) {
            int s = username.charAt(i);
            if (s > 47 && s < 58) {
                count1++;
            } else if (s > 64 && s < 91) {
                count2++;
            } else if (s > 96 && s < 123) {
                count2++;
            }
        }
        if (count1 == username.length()) return false;  //用户名全是数字
        if (count2 == username.length()) return false;  //用户名全是字母
        if (count1 + count2 == username.length()) {
            return true;  //用户名包含数字与字母
        } else {
            return false;
        }
    }

    /**
     * 校验密码长度  3~12
     *
     * @param password
     * @return 符合规则返回true   反之返回false
     */
    private static boolean checkPassword(String password) {
        if (password.length() >= 3 && password.length() <= 12) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 校验身份证号的有效性
     *
     * @param identityCard
     * @return 有效返回 true  无效返回 false
     */
    private static boolean checkIdentityCard(String identityCard) {
        if (identityCard.length() != 18) return false;
        int start = identityCard.charAt(0);
        if (start == 48) return false;
        for (int i = 0; i < identityCard.length() - 1; i++) {
            int number = identityCard.charAt(i);
            if (number < 48 || number > 57) {
                return false;
            }
        }

        int end = identityCard.charAt(identityCard.length() - 1);
        if (end == 88 || end == 120) return true;
        if (end > 47 && end < 58) {
            return true;
        } else {
            return false;
        }
    }
}
