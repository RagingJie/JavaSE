package Test;

public class user1 extends Person1 {

    String name;
    int age;

    public user1() {
        this.name = "张三";
    }

    public static void main(String[] args) {
        user1 user1 = new user1();
        System.out.println(user1.name);
        System.out.println("name:" + user1.name + "，age：" + user1.age);
    }

}
