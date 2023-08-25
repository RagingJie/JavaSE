package Test;


class Person{
    protected String name;

    public Person(String name) {
        this.name = name;
    }

}

class Student extends Person {
    private String name;

    public Student(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public void getInfo(){
        System.out.println(this.name);      //Child
        System.out.println(super.name);     //Father
    }

}

public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student("Father","Child");
        s1.getInfo();

    }
}
