package Abstract.Demo02;

/**
 * @Author Naruto
 * @Date 2024/3/4 16:43
 * @Description: 测试类
 */
public class Test {
    public static void main(String[] args) {

        Frog frog = new Frog("青蛙", 12);
        System.out.println(frog.getName() + "，" + frog.getAge());
        frog.eat();
        frog.drink();

        System.out.println();

        Dog dog = new Dog("狗", 6);
        System.out.println(dog.getName() + "，" + dog.getAge());
        dog.eat();
        dog.drink();
        System.out.println();

        Sheep sheep = new Sheep("山羊", 8);
        System.out.println(sheep.getName() + "，" + sheep.getAge());
        sheep.eat();
        sheep.drink();
    }
}
