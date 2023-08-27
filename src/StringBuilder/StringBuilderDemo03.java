package StringBuilder;


import java.util.Scanner;

/**
 * 需求:键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
 *       对称字符串：123321、111
 *       非对称字符串：123123
 */
public class StringBuilderDemo03 {
    public static void main(String[] args) {
        //使用StringBuilder的场景
        //1.字符串的拼接
        //2.字符串的反转

        //1.键盘录入一个输入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String next = scanner.next();

        /*StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(next);
        StringBuilder reverse = stringBuilder.reverse();
        String s = reverse.toString();*/

        String s = new StringBuilder().append(next).reverse().toString();

        if (s.equals(next)){
            System.out.println(next+"为对称字符串~");
        }else {
            System.out.println(next+"为非对称字符串~");
        }
    }
}
