package Array;

/**
 * 动态初始化二维数组
 */
public class TwoArray1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        arr[0][1] = 1;
        for (int i = 0; i < arr.length; i++) {
            //内循环：遍历一维数组获取里面的每一个元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
