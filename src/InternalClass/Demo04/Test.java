package InternalClass.Demo04;

/**
 * @Author Naruto
 * @Date 2024/3/5 14:08
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        // 注意事项:
        // 1.静态内部类也是成员内部类中的一种
        // 2.静态内部类只能访问外部类中的静态变量和静态方法，
        //  如果想要访问非静态的需要创建外部类的对象。


        // 创建静态内部类对象的格式:
        //        外部类名·内部类名 对象名= new 外部类名·内部类名();
        // 调用静态方法的格式:
        //        外部类名.内部类名·方法名();

        Outer.Inner inner = new Outer.Inner();
        inner.show1();
        inner.show2();   // 静态的方法也可以这样访问，但是不推荐，IDEA也不会有提示


        System.out.println();

        // 创建静态内部类的对象
        // 只要是静态的东西，都可以用类名点直接获取

        Outer.Inner.show2();  // 调用静态方法推荐

    }
}
