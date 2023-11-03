package Polymorphic.PolymorphicDemo01;

/**
 * @Author Naruto
 * @Date 2023/11/3 15:57
 * @Description:
 */
public class Administrator extends Person {
    public void show(){
        System.out.println("管理员的信息为："+getName()+"，"+getAge());
    }
}
