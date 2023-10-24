package Extends.Demo07;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("****************************");
        Student student = new Student("张三",20);
        System.out.println("姓名:"+student.name+"，年龄："+student.age);
    }
}
