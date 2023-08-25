package String;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String next = scanner.next();

        //统计大小写，数字数量
        int smallCount = 0;
        int bigCount = 0;
        int numCount = 0;

        for (int i = 0; i < next.length(); i++) {
            char c = next.charAt(i);
            if (c>='A' && c<='Z'){
                bigCount++;
            }else if(c>='a'&&c<='z'){
                smallCount++;
            }else if (c>='0'&&c<'9'){
                numCount++;
            }
        }

        System.out.println("小写字母有"+smallCount+"个");
        System.out.println("大写字母有"+bigCount+"个");
        System.out.println("数字有"+numCount+"个");
    }
}
