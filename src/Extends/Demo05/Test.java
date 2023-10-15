package Extends.Demo05;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.lunch();
    }
}

class Person {

    public void eat() {
        System.out.println("吃剩菜");
    }

    public void drink() {
        System.out.println("喝凉白开哦");
    }

}

class Student extends Person {
    public void lunch() {

        this.drink();
        this.eat();


        super.eat();
        super.drink();
    }

    public void eat(){
        System.out.println("吃泡面");
    }

    public void drink(){
        System.out.println("喝凉水~~");
    }

}