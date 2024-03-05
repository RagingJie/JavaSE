package InternalClass.Demo04;

/**
 * @Author Naruto
 * @Date 2024/3/5 14:11
 * @Description:
 */
public class Outer {

    int a = 10;
    static int b = 20;


    // 静态内部类
    static class Inner {

        public void show1(){
            Outer outer = new Outer();
            System.out.println(outer.a); // 非静态的需要创建外部类对象来访问
            System.out.println(b); // 静态的可直接访问
            System.out.println("非静态方法被调用了......");
        }

        public static void show2(){
            Outer outer = new Outer();
            System.out.println(outer.a);  // 非静态的需要创建外部类对象来访问
            System.out.println(b); // 静态的可直接访问
            System.out.println("静态方法被调用了......");
        }
    }
}
