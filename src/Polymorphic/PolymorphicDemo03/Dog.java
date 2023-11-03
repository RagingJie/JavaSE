package Polymorphic.PolymorphicDemo03;

/**
 * @Author Naturo
 * @Date 2023/11/3 17:08
 * @Description:
 */
public class Dog extends Ainimal{
    @Override
    public void eat(){
        System.out.println("狗在吃东西.....");
    }

    public void lookHome(){
        System.out.println("狗在看家......");
    }
}
