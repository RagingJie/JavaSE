package Polymorphic.PolymorphicDemo01;

/**
 * @Author Naruto
 * @Date 2023/11/3 15:55
 * @Description:
 */
public class Teacher extends Person {

    public void show(){
        System.out.println("老师的信息为："+getName()+"，"+getAge());
    }
}
