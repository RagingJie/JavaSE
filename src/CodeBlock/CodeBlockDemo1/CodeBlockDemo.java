package CodeBlock.CodeBlockDemo1;

/**
 * @Author naruto
 * @Date 2023/11/30 23:55
 * @Description:
 */
public class CodeBlockDemo {
    public static void main(String[] args) {

       /* {
            int a = 10;
        }//因为代码执行到这里的时候，变量a从内存中就消失了
        System.out.println(a);*/

        //创建对象
        Student student = new Student();

        Student s2 = new Student("李三", 15);

        Student s3 = new Student("王五");
    }
}
