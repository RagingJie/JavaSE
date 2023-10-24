package Extends.Demo09;

public class Student {
    String name;
    int age;
    String school;

    //需求：
    //默认为家里蹲大学

    public Student(){
        //表示调用本类其他的构造方法
        //细节：虚拟机就不会添加 super()
        this(null,0,"家里蹲大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
