package Interface.Demo01;

/**
 * @Author Naruto
 * @Date 2024/3/4 17:23
 * @Description:
 */
public class Dog extends Animal implements Swimming {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗刨");
    }
}
