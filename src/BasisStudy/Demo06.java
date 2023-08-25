package BasisStudy;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        System.out.println("两位数相加方法：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int j = scanner.nextInt();
        System.out.println("两数相加的和为：");
        System.out.println(i+j);
        scanner.close();
    }
}
