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

    //应用场景:当父类中方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写。
    // 注意: 子类中重写的方法上面需要加上@Override
    @Override  //标记方法重写的注解
    public void eat(){
        System.out.println("吃泡面");
    }

    public void drink(){
        System.out.println("喝凉水~~");
    }

}