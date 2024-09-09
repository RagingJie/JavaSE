package Generics.Exercise;

/**
 * @Author
 * @Date 2024/9/6 16:45
 * @Description:
 */
public class PersianCat extends Cat {
    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的，" + getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
