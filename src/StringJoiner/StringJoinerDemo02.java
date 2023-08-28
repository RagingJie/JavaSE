package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo02 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]"); //三个参数：（分隔符，开始标识符，结束标识符）

        sj.add("a");
        sj.add("b");
        sj.add("v");
        sj.add("a");
        sj.add("dawhjklajw");

        int length = sj.length();

        System.out.println(sj);

        System.out.println(length); //length 表示的是拼接后的总长度

        String s = sj.toString();
        System.out.println(s.length());
        System.out.println(s);

    }
}
