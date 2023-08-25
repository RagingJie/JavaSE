package ConsolidationExercise;

/**
 * 需求:
 * 某系统的数字密码（大于0)，比如1983，采用加密方式进行传输。
 * 规则如下:
 * 先得到每位数，
 * 然后每位数都加上5，
 * 再对10求余，
 * 最后将所有数字反转，
 * 得到一串新数。
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 2,5};

        //每位数 + 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }

        //没位数对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }

        for (int i : arr) {
            System.out.print(i);
        }

        //中介
        //将数字位置反转
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
