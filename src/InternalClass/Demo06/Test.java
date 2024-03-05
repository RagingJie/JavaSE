package InternalClass.Demo06;

/**
 * @Author
 * @Date 2024/3/5 23:22
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        /*
        需要大家理解匿名内部类的格式，而不是硬记:

            new 类名或者接口名(){
                重写方法;
            };   注意后面一定要加;

        */

        // 编写匿名内部类的代码
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了Swim接口的swim方法");
            }
        };


        new Animal() {

            @Override
            void show() {
                System.out.println("重写了Animal的shwo方法");
            }
        };


        // 调用method方法
        // 之前的方式，创建一个Animal的子类，去继承Animal抽象类，用子类做参数去调用method（因为抽象类不能被实例化）
        Dog dog = new Dog();
        method(dog);  // 多态的思想


        // 如果Dog类我只用一次，那么还需要定义一个类实属太麻烦
        method(
                new Animal() {
                    @Override
                    void show() {
                        System.out.println("11111");
                    }
                }
        );
    }

    public static void method(Animal animal) {  // 多态的思想   编译看左边，运行看右边（看左边的对象中是否有方法，运行时会运行子类的方法）
        animal.show();
    }
}
