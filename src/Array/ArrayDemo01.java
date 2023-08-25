package Array;

/**
 * 数组元素访问
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{11, 22, 33, 44, 55};
        System.out.println(arr1[0]); //索引是从0开始的

        //细节：一旦被覆盖，之前的数据就不存在了
        arr1[0] = 10;
        System.out.println(arr1[0]);
    }
}
