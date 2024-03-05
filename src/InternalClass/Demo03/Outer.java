package InternalClass.Demo03;

/**
 * @Author Naruto
 * @Date 2024/3/5 13:38
 * @Description:
 */
public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            // Outer.this获取了外部类对象的地址值
            System.out.println(Outer.this.a);   // 10
            System.out.println(this.a);   // 20
            System.out.println(a);   // 30  就近原则
        }
    }
}
