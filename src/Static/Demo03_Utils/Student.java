package Static.Demo03_Utils;

/**
 * 需求:定义一个集合，用于存储3个学生对象。
 *      学生类的属性为: name、age、gender
 *          定义一个工具类，用于获取集合中最大学生的年龄。
 */
public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
