package StringBuilder;

/**
 * StringBuilder相当于一个容器，而不是一个String类型的字符串
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();

        //2.添加元素
        sb.append("abcdef");
        sb.append("123456");

        System.out.println(sb);

        //3.反转方法
        sb.reverse();

        //4.获取长度
        int length = sb.length();
        System.out.println("长度为："+length);

        //打印
        //普及：
        //因为StringBuilder是Java已经写好的类
        //java在底层对他做了一些特殊处理
        //打印对象不是地址值而是属性值
        System.out.println(sb);
    }
}
