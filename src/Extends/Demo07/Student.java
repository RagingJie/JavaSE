package Extends.Demo07;

public class Student extends Person {
    public Student(){
        super();
        System.out.println("子类的无参构造方法~~~");
    }

    public Student(String name, int age){
//        this.name = name;
//        this.age =age;
        super(name,age);  //调用父类的有参构造方法
    }
}
