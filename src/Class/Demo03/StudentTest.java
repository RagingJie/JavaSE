package Class.Demo03;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("张三",18,"2011154545");
        String s = student.toString();
        System.out.println(s);
    }
}
