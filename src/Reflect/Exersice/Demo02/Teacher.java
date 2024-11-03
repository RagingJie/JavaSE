package Reflect.Exersice.Demo02;

/**
 * @Author
 * @Date 2024/11/4 0:26
 * @Description:
 */
public class Teacher {

    private String name;
    private int age;


    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void teach() {
        System.out.println("老师正在教书");
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Teacher{name = " + name + ", age = " + age + "}";
    }
}
