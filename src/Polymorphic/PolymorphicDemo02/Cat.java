package Polymorphic.PolymorphicDemo02;

/**
 * @Author Naruto
 * @Date 2023/11/3 16:25
 * @Description:
 */
public class Cat extends Ainimal {

    String name = "小猫";

    @Override
    public void show(){
        System.out.println("Cat--------show");
    }
}
