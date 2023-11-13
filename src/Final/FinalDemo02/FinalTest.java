package Final.FinalDemo02;

/**
 * @Author
 * @Date 2023/11/10 17:24
 * @Description:
 */
public class FinalTest {
    public static void main(String[] args) {
        /*final修饰的变量是基本类型:那么变量存储的**数据值**不能发生改变
        final修饰的变量是引用类型: 那么变量存储的**地址值**不能发生改变，对象内部的可以改变

        核心：
            常量记录的数据是不可以改变的

        字符串是不可变的
        */

        final double PI = 3.1415926;

        final Student student = new Student("张三", 15);
        //记录的地址值不会发生变化，但是属性值是可以改变的
//        student = new Student();
        student.setAge(12);
        student.setName("王五");

    }
}
