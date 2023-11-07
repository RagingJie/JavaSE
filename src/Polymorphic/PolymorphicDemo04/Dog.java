package Polymorphic.PolymorphicDemo04;

/**
 * @Author Naruto
 * @Date 2023/11/7 15:31
 * @Description:
 */
public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public void eat(String something){
        System.out.println("小狗正在吃东西......");
    }

    /**
     * @return void
     * @author Naruto
     * @date 2023/11/7 15:39
     * @description 看家
     */
    public void lookHome(){
        System.out.println("小狗在看家......");
    }

    public String toString() {
        return "Dog{}";
    }
}
