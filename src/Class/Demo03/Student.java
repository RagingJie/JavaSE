package Class.Demo03;

/**
 * 构造方法的定义
 *      如果没有定义构造方法，系统将给出一个默认的无参数构造方法
 *      如果定义了构造方法，系统将不再提供默认的构造方法
 * 构造方法的重载
 *      带参构造方法，和无参数构造方法，两者方法名相同，但是参数不同，这叫做构造方法的重载
 * 推荐的使用方式
 *      无论是否使用，都手动书写无参数构造方法，和带全部参数的构造方法
 */
public class Student {
    private String name;
    private int age;
    private String id;

    public Student() {
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
