package Polymorphic.PolymorphicDemo01;

/**
 * @Author Naruto
 * @Date 2023/11/3 15:46
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

    public void show() {
        System.out.println("Person{name = " + name + ", age = " + age + "}");
    }
}
