package ExecutionFlow;

import java.util.Scanner;

/**
 * 需求:
 * 键盘录入两个数字，表示一个范围。统计这个范围中。
 * 既能被3整除，又能被5整除数字有多少个?
 */
public class OrderDemo04_While_Test05 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入开始的数字（整数）：");
        int number1 = scanner.nextInt();
        System.out.println("请输入结束的数字（整数）：");
        int number2 = scanner.nextInt();
        int[] result = new int[number2];
        int a = 0;
        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[a] = i;
                count++;
                a++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.length && result[i] !=0; i++) {
            if (result[i+1] == 0) {
                stringBuilder.append(result[i]);
            } else {
                stringBuilder.append(result[i] + ",");
            }

        }
        System.out.println("既能被3整除，又能被5整除数字为：" + stringBuilder);
        System.out.println("既能被3整除，又能被5整除数字有" + count + "个");
    }
}
