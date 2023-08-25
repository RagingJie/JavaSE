package Array;

/**
 * 求数组中的最大  最小值
 */
public class ArrayDemoTest04 {
    public static void main(String[] args) {
        int[] arr = {22,33,55,4,2,6,5,84,100};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
    }
}
