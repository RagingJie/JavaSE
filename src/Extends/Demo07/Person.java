package Extends.Demo07;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("父类的无参构造方法~~~");

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
