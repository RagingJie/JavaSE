package Extends.Demo08;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.age = 23;

        student.show();

        //可以把对象在内存中的结构打印出来
        /*ClassLayout classLayout = ClassLayout.parseInstance(student);
        System.out.println(classLayout.toPrintable);*/
    }
}
