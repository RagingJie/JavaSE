package Interface.Demo01;

/**
 * @Author naruto
 * @Date 2024/3/4 17:24
 * @Description:
 */
public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }
}
