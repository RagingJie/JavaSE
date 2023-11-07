package Polymorphic.PolymorphicDemo04;

/**
 * @Author Naruto
 * @Date 2023/11/7 15:32
 * @Description:
 */
public class Cat extends Animal{

    public Cat() {
    }

    @Override
    public void eat(String something){
        System.out.println("小猫正在吃东西......");
    }

    /**
     * @return void
     * @author Naruto
     * @date 2023/11/7 15:39
     * @description 逮老鼠
     */
    public void catchMouse(){
        System.out.println("小猫在逮老鼠......");
    }

    public String toString() {
        return "Cat{}";
    }
}
