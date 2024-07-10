package IO_Stream.ReviewExercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Naruto
 * @date 2024/7/11 0:50
 * @description
 */
public class Exercises14 {

    /* 需求
            将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
     */

    private final static String destinationSourcePath = "src\\IO_Stream\\ExerciseFile\\writeObjectList.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        long start = System.currentTimeMillis();

        // 序列化写出数据
//        write();

        // 反序列化读入数据
        read();

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/11 0:56
     * @description 序列化对象写出
     */
    private static void write() throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(destinationSourcePath));

        // 自定义对象
        Student s1 = new Student("刘总", 18, "山回", 182.5);
        Student s2 = new Student("花总", 25, "深圳", 168.5);
        Student s3 = new Student("王八", 40, "上海", 148.5);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        oos.writeObject(list);

        // 释放资源
        oos.close();
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/11 1:05
     * @description 反序列化读出对象数据
     */
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(destinationSourcePath));

        // 读入数据
        List<Student> list = (List<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }

        // 释放资源
        ois.close();
    }


    /**
     * 学生类
     */
    static class Student implements Serializable {

        private static final long serialVersionUID = 8881296927553028263L;

        private String name;
        private int age;
        private String address;
        private double height;


        public Student() {
        }

        public Student(String name, int age, String address, double height) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.height = height;
        }

        /**
         * 获取
         *
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * 设置
         *
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取
         *
         * @return age
         */
        public int getAge() {
            return age;
        }

        /**
         * 设置
         *
         * @param age
         */
        public void setAge(int age) {
            this.age = age;
        }

        /**
         * 获取
         *
         * @return address
         */
        public String getAddress() {
            return address;
        }

        /**
         * 设置
         *
         * @param address
         */
        public void setAddress(String address) {
            this.address = address;
        }

        /**
         * 获取
         *
         * @return height
         */
        public double getHeight() {
            return height;
        }

        /**
         * 设置
         *
         * @param height
         */
        public void setHeight(double height) {
            this.height = height;
        }

        public String toString() {
            return "Student{name = " + name + ", age = " + age + ", address = " + address + ", height = " + height + "}";
        }
    }

}
