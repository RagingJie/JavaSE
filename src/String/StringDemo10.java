package String;

/**
 * 屏蔽手机号
 */
public class StringDemo10 {
    public static void main(String[] args) {
        String phoneNumber = "19888855891";

        //根据索引截取字符串的内容，substring(0, 3)截取从0索引开始，但不包含3索引的内容，返回的结果才有效
        String start = phoneNumber.substring(0, 3);

        //substring(7);截取从7索引往后的所有内容，包含 7 索引的内容
        String end = phoneNumber.substring(7);

        System.out.println(start+"****"+end);


    }
}
