package Private_Default_Protected_Public.Demo1;

/**
 * @Author Naruto
 * @Date 2023/11/30 23:30
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        System.out.println(animal.name);  //因为私有，所以报错
        System.out.println(animal.age);
        System.out.println(animal.sex);
        System.out.println(animal.height);
    }
}
