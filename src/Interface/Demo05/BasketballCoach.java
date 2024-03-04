package Interface.Demo05;

/**
 * @Author Naruto
 * @Date 2024/3/4 21:14
 * @Description:
 */
public class BasketballCoach extends Coach {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球~");
    }
}
