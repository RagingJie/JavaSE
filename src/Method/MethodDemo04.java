package Method;

public class MethodDemo04 {
    public static void main(String[] args) {
        System.out.println("==================================================================================================================================");
        int[] arr = {11, 55, 45, 4, 654, 65, 465499, 54, 564, 64, 654, 464, 5645, 21, 51, 51, 2};
        printArray(arr);
        int arrayMax = getArrayMax(arr);
        System.out.println("数组的最大值为："+arrayMax);
        int num = 11;
        boolean contains = contains(num, arr);
        System.out.println("数组中是否存在"+num+"："+(contains ? "存在" : "不存在"));
        System.out.println("==================================================================================================================================");
    }

    //打印数组
    public static void printArray(int[] arr) {
        System.out.print("数组中的数据为：");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    //求数组最大值
    public static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //判断数组中是否存在某位数字
    public static boolean contains(int num,int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                flag = true;
            }
        }
        return flag;
    }
}
