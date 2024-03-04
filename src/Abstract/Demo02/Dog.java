package Abstract.Demo02;

/**
 * @Author Naruto
 * @Date 2024/3/4 16:42
 * @Description: 狗
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
