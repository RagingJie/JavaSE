package Abstract.Demo01;

/**
 * @Author Naruto
 * @Date 2024/3/4 16:20
 * @Description:
 */
public abstract class Person {

    private String name;
    private int age;

    public abstract void work();

    //作用：当创建子类对象的时候，给属性进行赋值的。
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
