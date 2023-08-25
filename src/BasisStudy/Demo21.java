package BasisStudy;

/**
 * 逻辑运算符练习
 */

import java.util.Scanner;

/**
 * 数字6是一个真正伟大的数字，键盘录入两个整数。如果其中一个为6，最终结果输出true。
 *如果它们的和为 6的倍数。最终结果输出true。其他情况都是false。
 */
public class Demo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int number1 = scanner.nextInt();
        System.out.println("请输入第一个整数：");
        int number2 = scanner.nextInt();
        boolean result = number1 == 6 || number2 == 6 || (number1+number2) == 6;
        System.out.println(result);
    }
}
