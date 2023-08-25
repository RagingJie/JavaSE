package BasisStudy;

import java.util.Scanner;

/**
 * 练习：
 * 您和您的约会对象在餐厅里面正在约会键盘录入两个整数，表示你和你约会对象衣服的时髦度。
 * (手动录入0~10之间的整数，不能录其他）
 * 如果你的时笔程度大于你对象的时量程度，相亲就成功，输出true。否则输出false。
 */
public class Demo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的时髦度(数字仅限于0~10的整数)：");
        int me = scanner.nextInt();
        if (me>=0 && me<=10) {
            System.out.println("请输入约会对象的时髦度(数字仅限于0~10的整数)：");
            int she = scanner.nextInt();
            if (she >= 0 && she <= 10) {
                System.out.println(me > she);
                if (me > she) {
                    System.out.println("相亲成功！");
                } else {
                    System.out.println("相亲两人不合适~");
                }
            }
        }else {
                System.out.println("时髦度不在要求的数值范围内，请重新输入你的时髦度(数字仅限于0~10的整数)：");
                int you = scanner.nextInt();
                if (you>=0 && you<=10) {
                    System.out.println("请输入约会对象的时髦度(数字仅限于0~10的整数)：");
                    int he = scanner.nextInt();
                    if (he >= 0 && he <= 10) {
                        System.out.println(you > he);
                        if (you > he) {
                            System.out.println("相亲成功！");
                        } else {
                            System.out.println("相亲两人不合适~");
                        }
                    }
                }
            }

    }
}
