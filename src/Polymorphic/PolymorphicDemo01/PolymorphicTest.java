package Polymorphic.PolymorphicDemo01;

/**
 * @Author Naruto
 * @Date 2023/11/3 15:45
 * @Description: 多态的Demo
 */
public class PolymorphicTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        register(student);


        Teacher teacher = new Teacher();
        teacher.setAge(25);
        teacher.setName("李四");
        register(teacher);


        Administrator administrator = new Administrator();
        administrator.setAge(15);
        administrator.setName("Naruto");
        register(administrator);

        Person person = new Person();
        person.setAge(45);
        person.setName("宇智波佐助");
        register(person);

    }

    // 这个方法技能接收老师，又能接收学生，还能接收管理员
    // 只能把参数写成这三个类的父类
    private static void register(Person person){
        person.show();
    }
}
