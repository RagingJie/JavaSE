package Array;

/**
 * 数组遍历：将数组中的所有内容取出来，取出来之后可以（打印，求和，判断...）
 * 注意：遍历指的是取出数据的过程，不要局限的理解为，遍历就是打印
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //java中关于数组的一个长度属性，length是属性，不是方法
        int a[] = {1,45,4,54,64,64,54,545,415,15,1321,564,561,21,215,1,21,215,4,1,21,2,3};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +  " ");
        }
    }
}
