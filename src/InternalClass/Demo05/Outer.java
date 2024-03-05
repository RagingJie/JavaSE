package InternalClass.Demo05;

/**
 * @Author
 * @Date 2024/3/5 14:40
 * @Description:
 */
public class Outer {

    int b = 10;

    public void show() {

        int a = 10;

        // 局部内部类
        class Inner {

            String name;
            int age;

            public Inner(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void method1() {
                System.out.println("局部内部类中的method1方法");
                System.out.println("Outer的变量b:" + b);
                System.out.println("Inner的变量a:" + a);
            }


//            public static void method2() {
//                System.out.println("局部内部类中的method2静态方法");
//            }

        }

        Inner inner = new Inner("张三", 20);
        inner.method1();
        System.out.println(inner.age);
        System.out.println(inner.name);
    }
}
