package Generics.Exercise;

/**
 * @Author
 * @Date 2024/9/6 17:16
 * @Description:
 */
public class TeddyDog extends Dog {

    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的，" + getAge() + "岁的泰迪，正在吃骨头，边吃边蹭");
    }

}
