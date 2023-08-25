package ConsolidationExercise;

import java.util.Scanner;

/**
 * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
 * 选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
 */
public class Demo05 {
    public static void main(String[] args) {
        //1.键盘录入评委的分数
        //2.找出对高分与最低分并记录他们的索引
        //3.计算其余四个平均值，打印结果
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入分数([0 - 100]之间的整数)：");
            int number = scanner.nextInt();
            if (number>=0 && number <=100){
                arr[i] = number;
                i++;
            }else {
                System.out.println("输入分数超出范围！请重新输入分数，当前录入的为第"+(i+1)+"个分数数据~");
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(average(arr));
    }

    public static int average(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int average = 0;
        int sum = 0;
        //找出数组中的最大值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //找出数组中的最小值
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }

        for (int k = 0; k < arr.length; k++) {
            sum += arr[k];
        }
        average = (sum - max - min) / (arr.length - 2);
        return average;
    }
}
