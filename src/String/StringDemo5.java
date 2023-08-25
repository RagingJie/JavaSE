package String;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String next = scanner.next();

        for (int i = 0; i < next.length(); i++) {
            //charAt() 根据索引找到每个字符串的字符
            char c = next.charAt(i);
            System.out.println(c);
        }


    }
}
