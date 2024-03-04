package Interface.Demo02;

import java.util.Scanner;

/**
 * @Author Naruto
 * @Date 2024/3/4 19:53
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        System.out.println(Inter.a);

        //无法将值赋给 final 变量'a'
        //Inter.a = 20;

        InterImpl inter = new InterImpl();
        inter.work();

        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}
