package Polymorphic.PolymorphicDemo03;

/**
 * @Author Naturo
 * @Date 2023/11/3 17:08
 * @Description:
 */
public class Cat extends Ainimal{
    @Override
    public void eat(){
        System.out.println("猫在吃东西.....");
    }

    public void separatekHome(){
        System.out.println("猫在拆家......");
    }
}
