package Package.PackageDemo01;

import Package.DoMain1.Teacher;

/**
 * @Author Naruto
 * @Date 2023/11/7 16:48
 * @Description:
 */
public class PackageTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        student.setName("小红");
        System.out.println(student.getName()+"，"+student.getAge());

        String s = "ABC";
        System.out.println(s);


        //用两个相同名字的类名时，要使用全类名
        Teacher teacher = new Teacher();
        Package.DoMain2.Teacher teacher1 = new Package.DoMain2.Teacher();
    }
}
