package ArrayList;

import java.util.ArrayList;

/**
 * 定义一个学生对象，添加一些学生对象，并进行遍历
 *  学生类的属性为：姓名，年龄
 */
public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("刘茂", 18);
        Student s2 = new Student("王老吉", 20);
        Student s3 = new Student("鸣人", 23);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s3);

        System.out.println(students);

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
