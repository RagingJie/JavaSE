package String;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //键盘接收一个abc
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String s = scanner.next();

        String s1 = "abc";
        System.out.println(s == s1);
    }
}
