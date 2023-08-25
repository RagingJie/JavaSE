package String;

import java.util.Scanner;

/**
 * 将输入的一个字符串倒序显示
 * 如：abc  显示为：cba
 */
public class StringDemo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String next = scanner.next();
        String fan = fan(next);
        System.out.println(fan);
        System.out.println("***********");

        String s = fan2(next);
        System.out.println(s);


    }


    public static String fan(String s){
        String[] split = s.split("");
        for (int i = 0,j=split.length-1; i <= j; i++,j--) {
            String str = split[i];
            split[i] = split[j];
            split[j] = str;
        }
        String result = "";
        for (int i = 0; i < split.length; i++) {
            result = result + split[i];
        }
        return result;
    }


    public static String fan2(String s){
        String result = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
}
