package ConsolidationExercise;

import java.util.Scanner;

/**
 * 键盘录入一个字符串
 * 要求1∶长度为小于等于9
 * 要求2:只能是数字将内容变成罗马数字
 * 下面是阿拉伯数字跟罗马数字的对比关系:
 * Ⅰ -1、Ⅱ-2、Ⅲ- 3、IV - 4、V - 5、VI- 6、VII- 7、VI- 8、IX - 9
 * 注意点:
 * 罗马数字里面是没有0的
 * 如果键盘录入的数字包含0，可以变成 ” ”(长度为0的字符串)
 */
public class Demo12Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        String s;
        while (true) {
            s = scanner.next();
            boolean flag = checkStr(s);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则，请重新输入：");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String str = changeLuoMa(c);
            sb.append(str);
        }

        System.out.println(sb);

    }


    //对应罗马数字
    public static String changeLuoMa(char c) {

        //jdk12新特性

        /*String str;
        switch (c){
            case '1' -> str = "Ⅰ";
            case '2' -> str = "Ⅱ";
            case '3' -> str = "Ⅲ";
            case '4' -> str = "Ⅳ";
            case '5' -> str = "Ⅴ";
            case '6' -> str = "Ⅵ";
            case '7' -> str = "Ⅶ";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
            default -> str = "";
        }
        return str;*/

        String str = switch (c) {
                case '1' -> "Ⅰ";
                case '2' -> "Ⅱ";
                case '3' -> "Ⅲ";
                case '4' -> "Ⅳ";
                case '5' -> "Ⅴ";
                case '6' -> "Ⅵ";
                case '7' -> "Ⅶ";
                case '8' -> "Ⅷ";
                case '9' -> "Ⅸ";
                default -> "";
        };
        return str;
    }


    //校验字符串是否满足要求
    public static boolean checkStr(String s) {
        //要求1∶长度为小于等于9
        if (s.length() > 9) {
            return false;
        }

        //要求2:只能是数字
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
