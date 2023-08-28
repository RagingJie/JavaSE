package StringJoiner;

/**
 * 字符串原理小结;
 *      扩展底层原理一：字符串存储的内存原理
 *          1.直接赋值会复用字符串常量池中的
 *          2.new出来的不会复用，而是开辟一个新的空间
 *      扩展底层原理二： == 号比较的到底是什么？
 *          1.引用数据类型比较地址值
 *          2.基本数据类型比较数据值
 *      扩展底层原理三：字符串拼接的底层原理
 *          1.如果没有变量参与，都是字符串直接相加，编译之后就是拼接之后的结果，回复用串池中的字符串
 *          2.如果有变量参与，会创建新的字符串，浪费内存
 *      扩展底层原理四：StringBuilder 提高效率原理图
 *          所有拼接的内容都会往 StringBuilder 中放，不会创建很多无用的空间，节约内存
 *      扩展底层原理五：StringBuilder 源码分析
 *          1.默认创建一个长度为16的字节数组
 *          2.添加的内容长度小于16，直接存
 *          3.添加的内容大于16会扩容（原来的容量 * 2 + 2）
 *          4.如果扩容之后还不够，以实际长度为准
 *
 */
public class StringJoinerTest {
    public static void main(String[] args) {
        System.out.println("\n**************************************");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println("sb的初始容量为："+sb.capacity());
        System.out.println("sb的初始长度为："+sb.length());

        System.out.println("\n**************************************");
        sb.append("abcddwajkaj");
        System.out.println(sb);
        System.out.println("sb的容量为："+sb.capacity());
        System.out.println("sb的长度为："+sb.length());

        System.out.println("\n**************************************");
        sb.append("abcddwajkajkdawgdawj");
        System.out.println(sb);
        System.out.println("sb的容量为："+sb.capacity());
        System.out.println("sb的长度为："+sb.length());


        System.out.println("\n**************************************");
        sb.append("abcddwajkajkdaw1615gdawj4545151515jhjhjj51");
        System.out.println(sb);
        System.out.println("sb的容量为："+sb.capacity());
        System.out.println("sb的长度为："+sb.length());

    }
}
