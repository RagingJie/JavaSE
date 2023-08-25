package Array;

/*
    需求:
       生成10个1~100之间的随机数存入数组。
            1）求出所有数据的和
            2）求所有数据的平均数
            3）统计有多少个数据比平均值小
*/

import java.util.Random;

public class ArrayDemoTest05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int ave = 0;
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = random.nextInt(100) + 1;
            arr[i] = number;
        }

        System.out.println("随机生成的数组中的数据为：");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("\n\n所有数据的和为" + sum);

        ave = sum / arr.length;

        System.out.println("\n平均数为：" + ave);

        System.out.println("\n比平均数小的数有：");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ave) {
                count++;
                System.out.print(arr[i] +" ");
            }
        }

        System.out.println("\n\n数据中比平均数少的个数为：" + count);


    }
}
