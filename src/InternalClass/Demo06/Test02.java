package InternalClass.Demo06;

/**
 * @Author
 * @Date 2024/3/5 23:55
 * @Description:
 */
public class Test02 {


    // 一个没有名字的成员内部类
    Swim s = new Swim() {
        @Override
        public void swim() {
            System.out.println("重写swim中的方法，被自己调用");
        }
    };

    public static void main(String[] args) {

        /*
             匿名内部类书写格式

             new 类型/接口(){
                重写方法
             };
         */


        // 整体可以理解为Swim接口的实现类对象
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写swim中的方法，被自己调用");
            }
        };

        // 遵循编译看左边，运行看右边的多态原则
        s.swim();


        new Animal() {
            @Override
            void show() {
                System.out.println("重写动物的show方法，并测试");
            }
        }.show();


    }
}
