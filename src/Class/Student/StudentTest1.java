package Class.Student;

import java.util.Scanner;

/*
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息     如果存在，则删除，如果不存在，则提示删除失败。
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为heima002”的学生，如果存在，则将他的年龄+1岁
*/


/**
 * 完成要求 1 2
 */
public class StudentTest1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student("heima001", "一号学员", 18);
        Student s2 = new Student("heima002", "二号学员", 20);
        Student s3 = new Student("heima003", "三号学员", 23);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        Scanner scanner = new Scanner(System.in);
        Student s = new Student();
        System.out.println("请输入学生学号：");
        s.setId(scanner.next());
        System.out.println("请输入学生姓名：");
        s.setName(scanner.next());
        System.out.println("请输入学生年龄：");
        s.setAge(scanner.nextInt());
        int count = getCount(students);

        while (true) {
            if ((!duplicateCheckId(students, s)) && (!duplicateCheckName(students, s))) {
                if (count == students.length) {
                    Student[] studentsNew = new Student[students.length + 1];
                    for (int i = 0; i < studentsNew.length - 1; i++) {
                        studentsNew[i] = students[i];
                    }
                    studentsNew[studentsNew.length - 1] = s;
                    System.out.println("添加成功！");
                    for (int i = 0; i < studentsNew.length; i++) {
                        System.out.println(studentsNew[i].getId() + "," + studentsNew[i].getName() + "," + studentsNew[i].getAge());
                    }
                } else {
                    students[count] = s;
                    System.out.println("添加成功！");
                    for (int i = 0; i < students.length; i++) {
                        System.out.println(students[i].getId() + "," + students[i].getName() + "," + students[i].getAge());
                    }
                }
                break;
            } else if (duplicateCheckId(students, s)) {
                System.out.println("该学号已存在，请重新设置学生学号：");
                s.setId(scanner.next());
            } else if (duplicateCheckName(students, s)) {
                System.out.println("该姓名已存在，请重新设置学生姓名：");
                s.setName(scanner.next());
            } else {
                System.out.println("输入数据不合法！");
                break;
            }
        }

        System.out.println("请输入要删除的学生的学号：");
        String sid = scanner.next();
//        duplicateCheckId()
    }


    //获取数组中有几个学生对象
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //判断书中是否因存在该id对象
    public static boolean duplicateCheckId(Student[] arr, Student student) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getId().equals(student.getId())) {
                flag = true;
            }
        }
        return flag;
    }

    //判断书中是否因存在该Name对象
    public static boolean duplicateCheckName(Student[] arr, Student student) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getName().equals(student.getName())) {
                flag = true;
            }
        }
        return flag;
    }
}
