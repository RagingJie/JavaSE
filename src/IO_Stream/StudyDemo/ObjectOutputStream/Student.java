package IO_Stream.StudyDemo.ObjectOutputStream;

import java.io.Serializable;

/**
 * @Author
 * @Date 2024/7/9 17:17
 * @Description: 学生对象
 */

/*
        Serializable接口里面是没有抽象方法的，标记型接口
        一旦实现了这个接口，那么就表示当前的Student类可以被序列化

        理解：
            一个物品的合格证
 */
public class Student implements Serializable {

    // serialVersionUID：可理解为序列号 / 版本号
    // 作用：防止序列化与反序列化时，中间对象的属性可能发生变化而导致抛异常
    private static final long serialVersionUID = 4617296927553028263L;

    private String name;
    private int age;
    private double height;
    //  transient：关键字
    //   作用：不会把当前属性序列化到本地文件当中

    private transient String address;


    public Student() {
    }

    public Student(String name, int age, double height, String address) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.address = address;
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

    /**
     * 获取
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "name = " + name + ", age = " + age + ", height = " + height + ", address = " + address + "}";
    }
}
