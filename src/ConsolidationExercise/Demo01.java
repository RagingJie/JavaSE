package ConsolidationExercise;

import java.util.Scanner;

/**
 * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
 * 按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月）头等舱7折，经济舱6.5折。
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = scanner.nextDouble();
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入舱位（经济舱/头等舱）：");
        String cang = scanner.next();
        System.out.println("您选择的是：" + cang);
        if (month >= 5 && month <= 10) {
            hot(price, cang);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            cold(price, cang);
        } else {
            System.out.println("键盘录入的月份是非法数据！");
        }
    }

    public static void hot(double price, String cang) {
        String cangType1 = "经济舱";
        String cangType2 = "头等舱";
        System.out.println("目前为机票销售的旺季~");
        System.out.println("机票的原价为：" + price);
        if (cangType1.equals(cang)) {
            System.out.println("经济舱打八五折，折后的价格为：" + (price * 0.85));
        } else if (cangType2.equals(cang)) {
            System.out.println("头等舱打九折，折后的价格为：" + (price * 0.9));
        } else {
            System.out.println("没有该舱位!");
        }
    }

    public static void cold(double price, String cang) {
        String cangType1 = "经济舱";
        String cangType2 = "头等舱";
        System.out.println("目前为机票销售的淡季~");
        System.out.println("机票的原价为：" + price);
        if (cangType1.equals(cang)) {
            System.out.println("经济舱打六五折，折后的价格为：" + (price * 0.65));
        } else if (cangType2.equals(cang)) {
            System.out.println("头等舱打七折，折后的价格为：" + (price * 0.7));
        } else {
            System.out.println("没有该舱位!");
        }
    }
}
