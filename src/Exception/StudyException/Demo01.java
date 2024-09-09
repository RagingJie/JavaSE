package Exception.StudyException;

/**
 * @Author
 * @Date 2024/9/9 10:24
 * @Description:
 */
public class Demo01 {
    /*
      JVM默认的处理方式：
        1、把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
        2、程序停止执行，下面的代码不会再执行了
    */

    public static void main(String[] args) {
        System.out.println("你好啊");
        System.out.println(2 / 0);
        System.out.println("小猴子");
        System.out.println("尿床了");
        System.out.println("哈哈哈哈哈哈哈");
    }
}
