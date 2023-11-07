package Polymorphic.PolymorphicDemo04;

/**
 * @Author Naruto
 * @Date 2023/11/7 15:29
 * @Description:
 */
public class PolymorphicTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("老王");
        person.setAge(35);

        Dog dog = new Dog();
        dog.setAge(5);
        dog.setColor("白色");
        person.keepPet(dog,"骨头");

        System.out.println();

        Cat cat = new Cat();
        cat.setAge(3);
        cat.setColor("黑白相间");
        person.keepPet(cat,"鱼");

    }
}
