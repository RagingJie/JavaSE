package Interface.Demo05;

/**
 * @Author Naruto
 * @Date 2024/3/4 21:13
 * @Description:
 */
public class BasketballPlayer extends Athlete {

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球~");
    }
}
