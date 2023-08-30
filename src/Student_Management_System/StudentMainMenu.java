package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMainMenu {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mainMenu();
            boolean flag = false;
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    students.add(addStudent());
                    printAllStudents(students);
                    break;
                case 5:
                    printAllStudents(students);
                    break;
                default:
                    System.out.println("已退出~");
                    flag = true;
                    break;
            }

            if (flag) break;
        }
    }

    //添加学生
    public static Student addStudent() {

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生id:");
        String id = scanner.next();
        System.out.println("请输入学生姓名:");
        String name = scanner.next();
        System.out.println("请输入学生年龄:");
        int age = scanner.nextInt();
        System.out.println("请输入学生地址:");
        String address = scanner.next();

        student.setName(name);
        student.setId(id);
        student.setAddress(address);
        student.setAge(age);

        return student;
    }

    //查询所有存在的所有学生信息
    public static void printAllStudents(ArrayList<Student> students) {
        System.out.println("id           姓名   年龄    家庭地址");
        for (int i = 0; i < students.size(); i++) {

            String id = students.get(i).getId();
            String name = students.get(i).getName();
            String address = students.get(i).getAddress();
            int age = students.get(i).getAge();

            System.out.print(id + "     " + name + "   " + age + "      " + address);
            System.out.println();
        }
    }

    //初始菜单
    public static void mainMenu() {
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:显示所有");
        System.out.println("请输入您的选组~    (1~5)");
    }
}
