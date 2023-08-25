package Method;

//传递基本数据类型时，传递的是真实的数据，形参的改变，不影响实际参数的值
public class MethodDemo06 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
        change(number);
        System.out.println(number);
    }


    public static void change(int number) {
        number = 200;
    }
}
