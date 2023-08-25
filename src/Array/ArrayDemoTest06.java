package Array;

import java.util.Random;

/**
 * 将数组中的数据倒叙显示
 */
public class ArrayDemoTest06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};
        int temp = 0;

        //循环一
/*        int i = 0;
        int j = arr.length - 1;
        while ( i < j ){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }*/

        //循环二
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("调换顺序的数组为：");
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }

        //将数组中数据的顺序打乱
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int number = random.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }
        System.out.println("\n打乱顺序的数组为：");
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
    }
}
