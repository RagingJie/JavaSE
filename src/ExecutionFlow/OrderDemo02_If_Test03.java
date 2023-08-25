package ExecutionFlow;

import java.util.Scanner;

/*在实际开发中，多种情况判断时，会用到if的第三种格式:需求:
商场都会有VIP的会员制，根据不同的会员会有不同的折扣
假设商品总价为1000.
键盘录入会员级别，并计算出实际支付的钱。
会员1级:打9折。
会员2级:打8折。
会员3级:打7折。
非会员:不打折，要打也是打骨折。*/
public class OrderDemo02_If_Test03 {
    public static void main(String[] args) {
        System.out.println("假设商品总价为：1000￥");
        int zj = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========会员等级表==========");
        System.out.println("==========会员 1 级===========");
        System.out.println("==========会员 2 级===========");
        System.out.println("==========会员 3 级===========");
        System.out.println("============非会员============");
        System.out.println("请输入会员等级：");
        int level = scanner.nextInt();
        if (level == 1){
            System.out.println("会员价为："+(zj*0.9)+"￥");
        } else if (level == 2){
            System.out.println("会员价为："+(zj*0.8)+"￥");
        } else if (level == 3){
            System.out.println("会员价为："+(zj*0.7)+"￥");
        } else {
            System.out.println("非会员价为："+zj+"￥");
        }
        scanner.close();
    }
}
