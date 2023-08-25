package StringBuilder;

/**
 * StringBuilder相当于一个容器，而不是一个String类型的字符串
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();

        //2.添加元素
        sb.append("aaaa");
        sb.append("bbbb");
        sb.append("cccc");
        sb.append("dddd");

        System.out.println(sb); //aaaabbbbccccdddd不是一个字符串，可以使用 toString方法 将StringBuilder变为字符串

        //3.将StringBuilder变回字符串
        String s = sb.toString();
        System.out.println(s); //这个时候的 s 是一个字符串

    }
}
