package BasisStudy;

import java.util.Scanner;

public class Demo23 {
    public static void main(String[] args) {
        /*需求:动物园里有两只老虎，体重分别为通过键盘录入获得，
        请用程序实现判断两只老虎的体重是否相同。*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int number1 = scanner.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int number2 = scanner.nextInt();
        String result = number1 == number2 ? "两只老虎体重相同" : "两只老虎体重不同";
        System.out.println(result);
    }
}
