package BasisStudy;

public class Demo24 {
    public static void main(String[] args) {
        /*需求:一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm,
        请用程序实现获取这三个和尚的最高身高。*/
        int heiget1 = 150;
        int heiget2 = 210;
        int heiget3 = 165;
        int result1 = heiget1 > heiget2 ? heiget1 : heiget2;
        int result2 = result1 > heiget3 ? result1 : heiget3;
        System.out.println("最高身高为：" + result2 + "cm");
    }
}
