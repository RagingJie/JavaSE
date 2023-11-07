package Polymorphic.PolymorphicDemo04;

/**
 * @Author Naruto
 * @Date 2023/11/7 15:31
 * @Description:
 */
public class Animal {

    //年龄
    private int age;

    //颜色
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void eat(String something){
        System.out.println("动物正在吃东西......");
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
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Animal{age = " + age + ", color = " + color + "}";
    }
}
