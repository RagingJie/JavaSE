package ExecutionFlow;

import java.util.Scanner;

/**
 * 分支结构：if 判断语句
 */
public class OrderDemo02_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        double i = scanner.nextDouble();
        if(i > 2.0){
            System.out.println("小伙子酒量不错呦~");
        } else {
            System.out.println("小伙子，你的酒量还得练练啊~");
        }
        scanner.close();
    }
}
