package String;

/**
 * 1. Strin是Java定义好的一个类。定义在java.lang包中，
 *
 * 2. Java程序中的所有字符串文字（例如“"abcdefg" ) 。都被实为此类的对象.
 *
 * 3．字符串不可变，它们的值在创建后不能被更改
 */
public class StringDemo {
    public static void main(String[] args) {

        //1.使用直接赋值的方式获取一个字符串对象
        String s = "abc";
        System.out.println(s);

        //2.使用new的方式来获取一个字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s1 = new String();
        System.out.println("@"+s1+"!");

        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s2 = new String("zhangsan");
        System.out.println(s2);

        //传递一个字符数组，根据传递的字符数组内容再创建一个新的字符串对象
        //需求：我要修改字符串的内容。  abc  Qbc
        //abc -->  {'a','b','c'}  --> {'Q','b','c'} --> "Qbc"
        char[] arr = {'a','b','c'};
        String s3 = new String(arr);
        System.out.println(s3);


        //传递一个字节数组，根据传递的字节数组内容再创建一个新的字符串对象
        //应用场景：以后在网络当中传输的数据其实是字节信息
        //我们一般要把字节信息进行转换，转成字符串，此时就要用到这个构造方法
        byte[] bytes = {97,98,99,100};
        String s4 = new String(bytes);
        System.out.println(s4);

    }
}
