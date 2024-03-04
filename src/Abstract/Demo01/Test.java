package Abstract.Demo01;

/**
 * @Author Naruto
 * @Date 2024/3/4 16:26
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象
//        Person person = new Person();


        Student student = new Student("小王", 18);
        student.work();

        System.out.println(student.getName()+" , "+student.getAge());
    }
}
