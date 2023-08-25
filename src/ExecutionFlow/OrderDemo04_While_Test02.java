package ExecutionFlow;

/**
 * 需求：给你一个整数X。
 * 如果x是一个回文整数，打印 true ，否则，返回 false。
 * 解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数
 * OrderDemo04_While_Test01例如，121 是回文，而 123 不是。
 */
public class OrderDemo04_While_Test02 {
    public static void main(String[] args) {
        //给定一个数值
        int x = 123321;
        //定义一个临时变量，记录原来的值
        int temp = x;
        int num = 0;

        while (x != 0){
            int ge = x%10;
            x = x/10;
            num = num * 10 + ge;
        }
        System.out.println("x为："+x);
        System.out.println("原来数值的反序列化为："+num);

        System.out.print("该值是否为回文：");System.out.println(num == temp);
    }
}
