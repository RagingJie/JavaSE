package Abstract.Demo02;

/**
 * @Author Naruto
 * @Date 2024/3/4 16:43
 * @Description: 山羊
 */
public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃草");
    }
}
