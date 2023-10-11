package Static.Demo01;

/**
 * 静态变量，方法早于创建的对象，随着类的加载而加载，在堆中有特殊的静态存储区（静态区）,存储静态变量，但是静态方法还是存储在方法区
 * static修饰的变量被所有对象共享使用
 */
public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "刘老师";
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(15);
        //s1.setTeacherName("王老师");

        System.out.println(s1.toString());


        Student s2 = new Student();
        s2.setName("王五");
        s2.setAge(5);
        //此时的老师是null，因为没有设置s2对象的老师名字，由于老师是共享的，每个对象都存储时，太麻烦
        // 所以用到static关键字，它就是共享的

        System.out.println(s2.toString());
    }

}
