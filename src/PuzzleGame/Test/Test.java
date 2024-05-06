package PuzzleGame.Test;

import java.util.Random;

/**
 * @Author
 * @Date 2024/3/12 17:25
 * @Description: 二维数组练习
 */
public class Test {
    public static void main(String[] args) {
        int[] number = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(number.length);

        // 打乱数组顺序
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int index = random.nextInt(number.length);
            int temp = number[i];
            number[i] = number[index];
            number[index] = temp;
        }

        // 遍历数据
        for (int i : number) {
            System.out.print(i + " ");
        }

        int count = 0;

        // 将数组 number 放入二维数组中
        int[][] tArr = new int[4][4];
        for (int i = 0; i < tArr.length; i++) {
            for (int j = 0; j < tArr[i].length; j++) {
                tArr[i][j] = number[count];
                count++;
            }
        }

        // 遍历二维数组
        for (int i = 0; i < tArr.length; i++) {
            for (int j = 0; j < tArr[i].length; j++) {
                System.out.print(tArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
