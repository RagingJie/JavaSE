package ConsolidationExercise;

/**
 * 数字加密：
 * 基于Demo06开发
 */
public class Demo07 {
    public static void main(String[] args) {

        int number = 23154;
        System.out.println("加密前的密码为："+number);
        //定义一个临时变量，记录number的值
        int number1 = number;
        //记录number的长度
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        int[] arr = new int[count];
        for (int i =0; i < arr.length;i++){
            arr[i] = number1%10;
            number1 /= 10;
        }

        //每位数 + 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }

        //没位数对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }

      /*  for (int i : arr) {
            System.out.print(i);
        }*/

        //将数字位置反转
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
        }

        System.out.print("加密后的密码为：");
        for (int i : arr) {
            System.out.print(i);
        }


    }
}
