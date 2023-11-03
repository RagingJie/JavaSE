package Polymorphic.PolymorphicDemo03;

/**
 * @Author Naruto
 * @Date 2023/11/3 17:07
 * @Description:
 */
public class PolymorphicTest {
    public static void main(String[] args) {
        Ainimal a = new Dog();

        a.eat();

        //多态的弊端
        //不能调用子类的特有功能
        //报错的原因?
        //当调用成员方法的时候，编译看左边，运行看右边
        //那么在编译的时候会先检查左边的父类中有没有这个方法，如果没有直接报错
        //a.lookHome();

        //解决方案
        //变回子类类型就可以了
        //细节：转换的时候不能瞎转，如果转成其他类的类型，就会报错

//        Dog d  = (Dog) a;
//        d.lookHome();

//        Cat c = (Cat)a;
//        c.separatekHome();  //class Polymorphic.PolymorphicDemo03.Dog cannot be cast to class Polymorphic.PolymorphicDemo03.Cat (Polymorphic.PolymorphicDemo03.Dog and Polymorphic.PolymorphicDemo03.Cat are in unnamed module of loader 'app')

        if (a instanceof Dog){
            Dog d = (Dog)a;
            d.lookHome();
        }else if(a instanceof Cat){
            Cat c = (Cat)a;
            c.separatekHome();
        }else {
            System.out.println("没有这个类型，无法转换~~");
        }


        //新特性
        //先判断a是否为Dog类型，如果是，则强转成Dog类型，转换之后变量名为d
        // 如果不是，则不强转，结果直接是false
/*        if (a instanceof Dog d){
            d.lookHome();
        }else if(a instanceof Cat c){
            c.separatekHome();
        }else {
            System.out.println("没有这个类型，无法转换~~");
        }*/



    }
}
