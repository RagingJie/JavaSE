package Class.Demo02;

/**
 * 就近原则
 * this指向的是成员变量
 * this的作用：可以区分成员变量与局部变量
 */
public class GrilFriend {
    //属性
   private String name;  //成员变量
   private String sex;      //成员变量
   private int age;  //成员变量
   private double height; //成员变量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=18 && age<=50) {
            this.age = age;
        }else {
            System.out.println("非法数据~");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉~");
    }

    public void eat() {
        System.out.println("女朋友在吃饭~");
    }

    public void playGame() {
        System.out.println("女朋友在玩游戏~");
    }

    @Override
    public String toString() {
        return "GrilFriend{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
