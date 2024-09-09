package Generics.Exercise;

/**
 * @Author
 * @Date 2024/9/6 17:14
 * @Description:
 */
public class HuskyDog extends Dog {
    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的，" + getAge() + "岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
