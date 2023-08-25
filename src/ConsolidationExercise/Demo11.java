package ConsolidationExercise;

import java.util.Random;
import java.util.Scanner;

/**
 * 双色球
 */
public class Demo11 {
    public static void main(String[] args) {
        int[] numberArr = createNumber();
        for (int i = 0; i < numberArr.length; i++) {
            System.out.print(numberArr[i] + " ");
        }

        System.out.println();
        int[] ints = userInputNumber();
        for (int i = 0; i < numberArr.length; i++) {
            System.out.print(numberArr[i] + " ");
        }
        System.out.println();
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        System.out.println();
        //判断用户的中奖情况
        //红球  篮球
        int redCount = redCount(ints, numberArr);
        int blueCount = blueCount(ints, numberArr);
        System.out.println("红球中奖个数为：" + redCount + "个");
        System.out.println("蓝球中奖个数为：" + blueCount + "个");

        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万！");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万！");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000元！");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200元！");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10元！");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1)|| (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5元！");
        }else {
            System.out.println("感谢参与，谢谢惠顾~");
        }

    }

    //蓝球中奖个数
    public static int blueCount(int[] userInputArr, int[] createNumberArr) {
        int blueCount = 0;
        if (userInputArr[userInputArr.length - 1] == createNumberArr[createNumberArr.length - 1])
            blueCount++;
        return blueCount;
    }

    //红球中奖个数
    public static int redCount(int[] userInputArr, int[] createNumberArr) {
        int redCount = 0;
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < createNumberArr.length - 1; j++) {
                if (redNumber == createNumberArr[j]) {
                    redCount++;
                    break;
                }
            }
        }
        return redCount;
    }

    //接收用户输入的彩票号
    public static int[] userInputNumber() {
        //创建一个存储用户购买的彩票号码
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int number = scanner.nextInt();
            if (number >= 1 && number <= 33) {
                boolean flag = contains(arr, number);
                if (!flag) {
                    arr[i] = number;
                    i++;
                } else {
                    System.out.println("该红色号码已存在，请重新输入~");
                }
            } else {
                System.out.println("输入的球号超出范围！请重新输入~");
            }
        }

        while (true) {
            System.out.println("请输入蓝球号码：");
            int number = scanner.nextInt();
            if (number >= 1 && number <= 16) {
                arr[arr.length - 1] = number;
                break;
            } else {
                System.out.println("输入的球号超出范围！请重新输入~");
            }
        }
        return arr;
    }

    //生成中奖号码
    public static int[] createNumber() {
        //创建存储中奖号码的数组
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length; ) {
            int numberRed = random.nextInt(33) + 1;
            if (!contains(arr, numberRed)) {
                arr[i] = numberRed;
                i++;
            }
        }
        int numberBlue = random.nextInt(16) + 1;
        arr[arr.length - 1] = numberBlue;
        return arr;
    }

    //判断数组中是否已经包含该数字
    public static boolean contains(int[] arr, int number) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                flag = true;
            }
        }
        return flag;
    }
}