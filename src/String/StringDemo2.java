package String;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "Abc";

        // == 比较
        //基本数据类型：比的是数据值
        //引用数据类型：比的是地址值
        System.out.println(s1 == s2);//false


        //比较字符串对象中的内容是否相等
        //equals 不忽略大小写
        System.out.println(s1.equals(s2));//true

        //比较字符串对象中的内容是否相等，忽略大小写
        //equalsIgnoreCase 忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
