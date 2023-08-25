package String;

public class StringDemo1 {
    public static void main(String[] args) {
        //== 比较的是地址值是否相等，对于字符串来说
        //== 对基本数据类型比较的是值是否相等
        //s1 与 s2 jdk1.7以后，他们是在堆中有一个StringTable(串池),专门针对于直接赋值的字符串用的
        //在s1被创建时，他在串池中就存了 abc 字符串，s1存的是abc的地址值，s2在创建时会在串池中先找有没有abc的字符串
        //有的话，就直接将abc的地址值赋值给s2，这样s2与s1的地址值是一样的，所以返回的结果是true
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true

        //== 比较的是s3 与 s4 的地址值是否相等，因为是new出来的，所以都是开辟的新空间，所以地址值不相等  返回的是false
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);//false

        System.out.println(s1 == s4); //false
    }
}
