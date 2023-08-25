package Method;

//传递引用数据类型时，传递的是地址值，形参的改变，影响实际参数的值
public class MethodDemo07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("调用change方法前："+arr[1]);
        change(arr);
        System.out.println("调用change方法后："+arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
