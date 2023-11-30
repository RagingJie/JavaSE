package Private_Default_Protected_Public.Demo2;

import Private_Default_Protected_Public.Demo1.Animal;

/**
 * @Author Naruto
 * @Date 2023/11/30 23:32
 * @Description:
 */
public class Dog extends Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        System.out.println(dog.name);  //私有的，不能被在其他的子类使用
//        System.out.println(dog.age);  //默认的，不能被在其他的子类使用
        System.out.println(dog.sex);
        System.out.println(dog.height);
    }
}
