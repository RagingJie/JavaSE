package Array;

import javax.xml.transform.Result;

/**
 * 某商城每个季度的营业额如下:单位(万元)
 * 第一季度:22,66,44
 * 第二季度:77,33,88
 * 第三季度:25,45,65
 * 第四季度:11,66,99
 * 要求计算出每个季度的总营业额和全年的总营业额
 */
public class TwoArrayDemo01 {
    public static void main(String[] args) {
        //创建存储营业额的二维数组
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int sum1 = sum(arr, 1);
        int sum2 = sum(arr, 2);
        int sum3 = sum(arr, 3);
        int sum4 = sum(arr, 4);
        System.out.println("第一季度的总营业额：" + sum1);
        System.out.println("第二季度的总营业额：" + sum2);
        System.out.println("第三季度的总营业额：" + sum3);
        System.out.println("第四季度的总营业额：" + sum4);
        System.out.println("全年的总营业额：" + (sum1 + sum2 + sum3 + sum4));
    }

    //计算每个季度大的总营业额
    public static int sum(int[][] arr, int quarter) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) == quarter) {
                for (int j = 0; j < arr[i].length; j++) {
                    result = result + arr[i][j];
                }
            }
        }
        return result;
    }
}
