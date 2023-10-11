package Static.Demo03_Utils;

import java.util.ArrayList;

public class TestDmo {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(45);
        s1.setGender("女");
        students.add(s1);

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(20);
        s2.setGender("男");
        students.add(s2);

        Student s3 = new Student();
        s3.setName("王五");
        s3.setAge(35);
        s3.setGender("男");
        students.add(s3);

        int maxAge = MaxAgeUtil.getMaxAge(students);
        System.out.println(maxAge);


    }
}
