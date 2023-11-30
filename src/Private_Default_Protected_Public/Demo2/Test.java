package Private_Default_Protected_Public.Demo2;

import Private_Default_Protected_Public.Demo1.Animal;

/**
 * @Author Naruto
 * @Date 2023/11/30 23:33
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        System.out.println(animal.name); //私有的，不能被其他类使用
//        System.out.println(animal.age); //默认的，不能被不同包中使用
//        System.out.println(animal.sex);  //受保护的，不同包的无关类（不是子类）不能使用
        System.out.println(animal.height);
    }
}
