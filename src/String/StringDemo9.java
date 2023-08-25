package String;

import java.util.Scanner;

/**
 * 数字大小写转换
 */
public class StringDemo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        while (true) {
            System.out.println("输入一个数字");
            number = scanner.nextInt();
            if (number >= 0 && number <= 9999999) {
                break;
            } else {
                System.out.println("数字不合法！");
            }
        }

        int num;
        String result = "";
        while (true) {
            num = number % 10; //每次取个位
            number = number / 10;  //取到个位后，将各位去掉
            String s = toBigNum(num);  //获得对应的大写
            result = s + result; //大写结果
            if (number == 0) break;
        }
        System.out.println(result);

        String[] danWei = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        String money = "";
        int count = 7 - result.length();
        for (int i = 0; i < count; i++) {
            money = money + "零" + danWei[i];
        }

        System.out.println(money);

        int j = 0;
        for (int i = count; i < danWei.length; i++) {
            money = money + result.charAt(j) + danWei[i];
            j++;
        }

        System.out.println(money);

    }

    public static String toBigNum(int num) {
        String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return str[num];
    }
}
