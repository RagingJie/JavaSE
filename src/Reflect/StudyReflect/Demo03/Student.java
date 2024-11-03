package Reflect.StudyReflect.Demo03;

/**
 * @Author
 * @Date 2024/11/3 22:45
 * @Description:
 */
public class Student {

    private String name;
    public int age;
    protected double length;


    public Student() {
    }

    public Student(String name, int age, double length) {
        this.name = name;
        this.age = age;
        this.length = length;
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

    /**
     * 获取
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", length = " + length + "}";
    }
}
