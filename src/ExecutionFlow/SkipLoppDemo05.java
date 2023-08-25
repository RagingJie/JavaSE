package ExecutionFlow;

import java.util.Scanner;

/**
 * 需求：
 * 键盘录入一个整数，判断是否为质数
 * 质数（除了1与它本身，没有其他的除数）
 * 否则，就是合数
 */
public class SkipLoppDemo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = scanner.nextInt();
        /*int count = 0;
        for (int j = 2; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(i + "是质数");
        } else {
            System.out.println(i + "是合数");
        }*/
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
            }
        }
        if (flag){
            System.out.println(x+"是一个质数");
        }else {
            System.out.println(x+"不是一个质数");
        }

    }
}
