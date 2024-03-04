package Interface.Demo05;

/**
 * @Author Naruto
 * @Date 2024/3/4 21:00
 * @Description:
 */
public abstract class Athlete extends Person {

    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
