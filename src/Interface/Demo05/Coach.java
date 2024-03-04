package Interface.Demo05;

/**
 * @Author Naruto
 * @Date 2024/3/4 21:02
 * @Description:
 */
public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
