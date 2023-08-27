package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo01 {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("---");   //  --- 表示间隔符
        stringJoiner.add("aaa").add("bbb").add("ccc");

        System.out.println(stringJoiner);
    }

}
