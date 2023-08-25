package ConsolidationExercise;

import java.util.Arrays;

/**
 * 把一个数组的元素全部复制到另一个新数组中去
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 56, 65, 52, 6, 1, 65, 1561, 561, 561, 51, 5, 152, 15, 15, 1, 21, 51, 51, 5, 515, 12};
        int[] ints = copyArray(arr);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        System.out.println();
        int[] ints1 = copyArray1(arr);
        for (int i : ints1) {
            System.out.print(i + " ");
        }
    }

    public static int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static int[] copyArray1(int[] arr) {
        return Arrays.copyOfRange(arr, 0, arr.length);
    }
}
