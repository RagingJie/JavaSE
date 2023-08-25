package Class.Knowledge;

import java.util.Scanner;

public class Point01 {
    //键盘录入
    //第一套体系
    //nextInt() 接收整数
    //nextDouble()  //接收小数
    //next()  接收字符串
    //遇到空格、制表符，回车就停止接收。这些符号后面的数据就不会接收了

    //第二套体系
    //nextLine()  接收字符串
    //可以接收空格、制表符，回车就停止接收。

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("接收第一个整数");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.println("接收第二个整数");
        int x = scanner.nextInt();
        System.out.println(x);
    }
}
