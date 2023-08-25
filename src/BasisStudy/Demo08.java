package BasisStudy;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
        int i = scanner.nextInt();
        System.out.print("输入整数的个位数为：");
        int g = i%10;
        System.out.println(g);
        System.out.print("输入整数的十位数为：");
        int s = i/10%10;
        System.out.println(s);
        System.out.print("输入整数的百位数为：");
        int b = i/100%10;
        System.out.println(b);
    }
}
