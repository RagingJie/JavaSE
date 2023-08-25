package ExecutionFlow;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * case穿透：
 *      1~5为工作日
 *      6~7为休息日
 */
public class OrderDemo03_Switch_Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期：");
        int i = scanner.nextInt();
        switch (i){
           /* case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入星期有误");
                break;*/

            //简化代码
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("输入星期有误");
        }

    }
}
