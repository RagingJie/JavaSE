package Static.Demo01;


import java.io.Serializable;

/**
 * 总结:
 *    静态方法中没有this关键字静态方法中，
 *    只能访问静态。
 *    非静态方法可以访问所有。
 */
public class Student implements Serializable {
    private String name;
    private int age;
    static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String teacherName) {
        this.name = name;
        this.age = age;
        this.teacherName = teacherName;
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
