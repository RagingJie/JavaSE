package InternalClass.Demo03;

/**
 * @Author naruto
 * @Date 2024/3/5 13:38
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();

        inner.show();
    }
}
