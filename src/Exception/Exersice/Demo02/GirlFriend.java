package Exception.Exersice.Demo02;

import java.util.InputMismatchException;

/**
 * @Author
 * @Date 2024/9/10 0:11
 * @Description:
 */
public class GirlFriend {

    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length() < 3 || name.trim().length() > 10) {
            throw new NameFormatException(name + "长度有误，长度应该在3~10之间");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundsException(age + "超出输入年龄范围");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
