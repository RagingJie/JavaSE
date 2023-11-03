package Polymorphic.PolymorphicDemo02;

/**
 * @Author Naruto
 * @Date 2023/11/3 16:24
 * @Description:
 */
public class Dog extends Ainimal{

    String name = "小狗";

    @Override
    public void show(){
        System.out.println("Dog-----------show");
    }
}
