package Method;

public class MethodDemo01 {
    private final static double Π = 3.14;
    public static void main(String[] args) {
        add(50,60);
        getLength(10,4);
        getSquare(1);
    }

    //两数相加
    public static void add(int num1, int num2) {
        System.out.println("两数之和为："+(num1 + num2));
    }

    //求长方形的周长
    public static void getLength(double len, double width) {
        double result = (len + width) * 2;
        System.out.println("周长为："+result);
    }

    //求圆的面积
    public static void getSquare(double r) {
        double result = Π*r*r;
        System.out.println("圆的面积为："+result);
    }


}
