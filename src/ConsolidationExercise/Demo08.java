package ConsolidationExercise;

/**
 * 数字解密：
 */
public class Demo08 {
    public static void main(String[] args) {
        int number = 78609;  //解密之后应为：23154
        System.out.println("解密前的密码为："+number);
        int number1 = number;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number1 % 10;
            number1 /= 10;
        }
     /*   for (int i : arr) {
            System.out.print(i);
        }*/

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 5 && arr[i] != 6 && arr[i] != 7 && arr[i] != 8 && arr[i] != 9) {
                arr[i] = arr[i] + 10;
            }
        }
 /*       System.out.println();
        for (int i : arr) {
            System.out.print(i);
        }*/

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
     /*   System.out.println();
        for (int i : arr) {
            System.out.print(i);
        }*/
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
        }
        System.out.print("解密后的密码为：");
        for (int i : arr) {
            System.out.print(+i);
        }
    }
}
