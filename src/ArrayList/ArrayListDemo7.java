package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 定义一个学生对象，添加一些学生对象，并进行遍历
 *  学生类的属性为：姓名，年龄
 */
public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建学生对象
            Student student = new Student();
            System.out.println("请输入姓名：");
            String name = scanner.next();
            System.out.println("请输入年龄：");
            int age = scanner.nextInt();

            //设置学生的值
            student.setName(name);
            student.setAge(age);

            students.add(student);
        }

        System.out.print("[");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (i!=students.size()-1){
                System.out.print(s.getName()+","+s.getAge());
                System.out.print(", ");
            }else {
                System.out.print(s.getName()+","+s.getAge());
            }

        }

        System.out.println("]");
    }
}
