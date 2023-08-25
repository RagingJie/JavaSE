package Class.Knowledge;

import java.util.Scanner;

public class Point02 {
    public static void main(String[] args) {
        //两套键盘录入体系不能混用
        //弊端:先用nextInt，再用nextLine会导致下面的nextLine接受不到数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("接收第一个整数");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.println("接收第二个整数");
        String x = scanner.nextLine();
        System.out.println(x);
    }
}
