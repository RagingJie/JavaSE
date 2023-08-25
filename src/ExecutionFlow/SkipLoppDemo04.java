package ExecutionFlow;

import java.util.Scanner;

/**
 * 需求:
 * 键盘录入一个大于等于2的整数x﹐计算并返回x的平方根。
 * 结果只保留整数部分，小数部分将被舍去。
 */
public class SkipLoppDemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个大于等于2的整数：");
        int x = scanner.nextInt();
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        System.out.println(x + "的平方根为：" + (i - 1));
    }
}
