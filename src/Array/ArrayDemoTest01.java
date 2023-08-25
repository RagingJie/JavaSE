package Array;

/**
 * 定义一个数组，里面存：1，2，3，4，5
 * 遍历数组中的每一个元素，并求他们的和
 */
public class ArrayDemoTest01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num = num + a[i];
        }
        System.out.println("和为："+num);
    }
}
