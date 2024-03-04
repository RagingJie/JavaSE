package Abstract.Demo01;

/**
 * @Author Naruto
 * @Date 2024/3/4 16:29
 * @Description:
 */
public class Student extends Person{

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }

}
