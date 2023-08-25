package ExecutionFlow;


/**
 * 需求:
 * 给定两个整数，被除数和除数（都是正数，且不超过int的范围)将两数相除，要求不使用乘法、除法和 %运算符。
 * 得到商和余数。
 */
public class OrderDemo04_While_Test03 {
    public static void main(String[] args) {
        //第一种解题思路（自己写的）
        /*
        //第一个整数
        int number1 = 10;
        //第二个整数
        int number2 = 5;
        //两个整数的差
        int cha = 0;
        //两数相除的商
        int cout = 0;
        while (cha>=0){
            cha = number1 - number2;
            number1 = cha;
            cout++;
        }
        System.out.println("两数的商为："+(cout-1));
        System.out.print("两数的余数为：");System.out.println(number1+number2);
    }*/

        //第二种，视频中老师讲的，第二种的代码更建议
        int a = 10;
        int b = 5;
        int count = 0;
        while (a >= b){
            a = a - b;
            count++;
        }
        System.out.println("商为："+count);
        System.out.println("余数为："+a);

    }
}
