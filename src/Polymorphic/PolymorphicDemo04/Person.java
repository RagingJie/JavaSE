package Polymorphic.PolymorphicDemo04;

/**
 * @Author Naruto
 * @Date 2023/11/7 15:32
 * @Description:
 */
public class Person {

    //姓名
    private String name;

    //年龄
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    //喂狗
    public void keepPet(Dog dog,String something){
        System.out.println("饲养员正在喂"+dog+"吃"+something);
    }

    //喂猫
    public void keepPet(Cat cat,String something){
        System.out.println("饲养员正在喂"+cat+"吃"+something);
    }*/

    //喂养动作
    public void keepPet(Animal animal,String something){
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁小狗");
            System.out.println(dog.getAge()+"岁的"+dog.getColor()+"的狗两只前腿死死的抱住"+something+"猛吃");
        } else if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁小猫");
            System.out.println(cat.getAge()+"岁的"+cat.getColor()+"的猫眯着眼睛侧着头吃"+something);
        }

    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
