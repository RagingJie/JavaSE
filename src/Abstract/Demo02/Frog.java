package Abstract.Demo02;

/**
 * @Author Naruto
 * @Date 2024/3/4 16:41
 * @Description: 青蛙
 */
public class Frog extends Animal {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
}
