package Reflect.StudyReflect.Demo01;

/**
 * @Author
 * @Date 2024/11/3 21:51
 * @Description:
 */
public class MyReflectDemo {

    /*
           获取class对象的三种方式
           1、Class.forName("类全名")
           2、类名.class
           3、对象.getClass()
     */

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.第一种方式
        // 全类名：报名 + 类名
        // 最为常用的
        Class clazz1 = Class.forName("Reflect.StudyReflect.Demo01.Student");
        System.out.println(clazz1);

        // 2.第二种方式
        // 一般更多的是当做参数进行传递
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        // 3.第三种方式
        // 当我们已经有了这个类的对象时，才可以使用
        Student student = new Student();
        Class clazz3 = student.getClass();
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz3 == clazz2);
    }

}
