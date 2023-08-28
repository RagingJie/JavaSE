package ConsolidationExercise;

import java.util.Scanner;

/**
 * 键盘录入一个字符串
 * 要求1∶长度为小于等于9
 * 要求2:只能是数字将内容变成罗马数字
 * 下面是阿拉伯数字跟罗马数字的对比关系:
 * l -1、ll-2、Ⅲ- 3、IV - 4、V - 5、VI- 6、VII- 7、VI- 8、IX - 9
 * 注意点:
 * 罗马数字里面是没有0的
 * 如果键盘录入的数字包含0，可以变成 ” ”(长度为0的字符串)
 */
public class Demo12Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        String s;
        while (true) {
            s = scanner.next();
            boolean flag = checkStr(s);
            if (flag){
                break;
            }else {
                System.out.println("当前的字符串不符合规则，请重新输入：");
                continue;
            }
        }

        String[] split = s.split("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            String str = changeLuoMa(num);
            sb.append(str);
        }

        System.out.println(sb);

    }


    //对应罗马数字
    public static String changeLuoMa(int i){
        //定义一个数组，让
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[i];
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
