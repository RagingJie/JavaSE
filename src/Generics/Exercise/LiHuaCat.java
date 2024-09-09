package Generics.Exercise;

/**
 * @Author
 * @Date 2024/9/6 16:43
 * @Description:
 */
public class LiHuaCat extends Cat {

    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的，" + getAge() + "岁的狸花猫，正在吃鱼");
    }
}
