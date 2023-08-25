package Array;

/**
 * 二维数组
 */
public class TwoArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,2,6,7,9,8,5}};
        System.out.println(arr[0]);//[I@723279cf 一维数组的地址
        //外循环：遍历二维数组获取里面的每一个一维数组
        for (int i = 0; i < arr.length; i++) {
            //内循环：遍历一维数组获取里面的每一个元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
