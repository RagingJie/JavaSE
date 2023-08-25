package ExecutionFlow;

import java.util.Random;
import java.util.Scanner;

/** (猜数字小游戏！)
 * 需求：
 * 程序自动生成一个1~100之间的数字，使程序实现猜出这个数字是多少？
 */
public class OrderTest {
    public static void main(String[] args) {
        Random random = new Random();
        //括号中的100中的含义是：从0~99中生成随机数，不包含100
        int i = random.nextInt(100) + 1;


        //方法一
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您所猜的数字（1~100）：");
        int guessNumber = scanner.nextInt();
        while (guessNumber != i) {
            if (guessNumber > i) {
                System.out.println("猜大了");
            } else{
                System.out.println("猜小了");
            }
            System.out.println("\n再次输入您所猜的数字（1~100）：");
            int guessNumber2 = scanner.nextInt();
            guessNumber = guessNumber2;
        }
        System.out.println("恭喜你，猜中了！");
        System.out.println("结果为：" + guessNumber);*/

        //方法二
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜想的数字：");
            int guessNumber = scanner.nextInt();
            if (guessNumber > i){
                System.out.println("猜大了！");
            } else if (guessNumber < i){
                System.out.println("猜小了！");
            }else {
                System.out.println("恭喜你，猜中了！");
                System.out.println("猜中的结果为："+guessNumber);
                break;
            }
        }

    }
}
