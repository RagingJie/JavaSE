package Array;

/**
 * 数组的动态初始化
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        String[] arr1 = new String[50];

        arr1[0] = "zhangsan";
        arr1[1] = "lisi";
        arr1[2] = "wanglaowu";

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);


        //数组默认初始化值的规律
        //整数类型：默认初始化值 0
        //小数类型：默认初始化值 0.0
        //字符类型：默认初始化值'\u0000' 空格
        //布尔类型：默认初始化值 false
        //引用数据类型：默认初始化值 null
        int arr2[] = new int[20];
        arr2[0] = 1;
        arr2[1] = 2;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        //数组索引越界：访问不存在索引
        //最小索引：0
        //最大索引：（数组长度 - 1）
       // System.out.println(arr2[30]); //数组索引越界
    }
}
