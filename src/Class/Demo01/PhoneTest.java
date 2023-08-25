package Class.Demo01;

public class PhoneTest {
    public static void main(String[] args) {

        Phone p = new Phone();

        //给手机属性赋值
        p.brand = "小米";
        p.price = 3999.75;

        //获取对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用对象中的方法
        p.call();
        p.playGame();

    }
}
