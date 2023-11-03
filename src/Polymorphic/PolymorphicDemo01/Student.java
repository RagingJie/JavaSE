package Polymorphic.PolymorphicDemo01;

/**
 * @Author Naruto
 * @Date 2023/11/3 15:47
 * @Description:
 */
public class Student extends Person{
    public void show(){
        System.out.println("学生的信息为："+getName()+"，"+getAge());
    }
}
