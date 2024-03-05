package InternalClass.Demo02;

/**
 * @Author
 * @Date 2024/3/5 11:12
 * @Description:
 */
public class Outer {

    String name = "老六";

    private class Inner {
        String name = "张三";

//        static int age = 10;   // 内部类不能有静态声明 (JDK16以后可以用)
    }

    public Inner getInner() {
        return new Inner();
    }
}
