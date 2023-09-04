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
            loop:
            switch (choose) {
                case 1:  //添加学生信息
                    students.add(addStudent(students));
                    printAllStudents(students);
                    break;
                case 2:  //删除学生信息
                    System.out.println("请输入要删除学生的id");
                    String deleteId = scanner.next();
                    boolean aFlag = checkId(deleteId, students);
                    if (aFlag) {
                        deleteStudent(deleteId, students);
                    } else {
                        System.out.println("id为 " + deleteId + " 的学生信息不存在，重新输入：");

                    }
                    break;
                case 3:  //修改学生信息
                    System.out.println("请输入要修改学生的id");
                    String updateId = scanner.next();
                    boolean bFlag = checkId(updateId, students);
                    if (bFlag) {
                        updateStudent(updateId, students);
                    } else {
                        System.out.println("id为 " + updateId + " 的学生信息不存在，重新输入：");

                    }
                    break;
                case 4:  //查询学生信息
                    System.out.println("请输入要查询学生的id");
                    String getId = scanner.next();
                    boolean cFlag = checkId(getId, students);
                    if (cFlag) {
                        printStudent(getStudent(getId, students));
                    } else {
                        System.out.println("id为 " + getId + " 的学生信息不存在，重新输入：");

                    }
                    break;
                case 5:  //查询全部
                    printAllStudents(students);
                    break;
                case 6: //退出
                    System.out.println("退出");
                    flag = true;
                    break;
                default:
                    System.out.println("没有此选项~");
                    break;
            }

            if (flag) System.exit(0);  //虚拟机停止运行
        }
    }

    //添加学生
    public static Student addStudent(ArrayList<Student> students) {

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("请输入学生id:");
            String id = scanner.next();
            boolean flag = checkId(id, students);
            if (flag){
                System.out.println("id为" + id + "的学生信息已存在，重新输入id：");
            } else {
                student.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名:");
        String name = scanner.next();
        System.out.println("请输入学生年龄:");
        int age = scanner.nextInt();
        System.out.println("请输入学生地址:");
        String address = scanner.next();

        student.setName(name);
        student.setAddress(address);
        student.setAge(age);

        System.out.println("学生信息添加成功~");
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
        System.out.println("6:退出系统");
        System.out.println("请输入您的选组~    (1~5)");
    }

    //根据id删除学生信息
    public static void deleteStudent(String id, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            String getId = students.get(i).getId();
            if (getId.equals(id)) {
                students.remove(i);
                System.out.println("删除成功！");
            }
        }
    }

    //根据id修改学生信息
    public static void updateStudent(String id, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            String getId = students.get(i).getId();
            if (getId.equals(id)) {
                Student student = addStudent(students);
                students.get(i).setId(student.getId());
                students.get(i).setName(student.getName());
                students.get(i).setAge(student.getAge());
                students.get(i).setAddress(student.getAddress());
            }
        }
    }

    //根据id查询学生信息
    public static Student getStudent(String id, ArrayList<Student> students) {
        Student student = new Student();
        for (int i = 0; i < students.size(); i++) {
            String getId = students.get(i).getId();
            if (getId.equals(id)) {
                String getName = students.get(i).getName();
                String getAddress = students.get(i).getAddress();
                int getAge = students.get(i).getAge();

                student.setId(getId);
                student.setName(getName);
                student.setAge(getAge);
                student.setAddress(getAddress);
            }
        }
        return student;
    }

    //查询相关id的学生信息
    public static void printStudent(Student student) {
        System.out.println("id           姓名   年龄    家庭地址");

        String id = student.getId();
        String name = student.getName();
        String address = student.getAddress();
        int age = student.getAge();

        System.out.print(id + "     " + name + "   " + age + "      " + address);
        System.out.println();
    }

    //校验id是否存在
    public static boolean checkId(String id, ArrayList<Student> students) {

        for (int i = 0; i < students.size(); i++) {
            String getId = students.get(i).getId();
            if (id.equals(getId)) {
                return true;
            }
        }
        return false;
    }

}
