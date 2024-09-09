package Exception.Exersice.Demo02;

import javax.naming.Name;
import java.util.Scanner;

/**
 * @Author
 * @Date 2024/9/10 0:00
 * @Description:
 */
public class App {
    /*
            需求：
                键盘录入自己心仪的女朋友和年龄
                姓名的长度在3~10之间
                年龄的范围是18~40岁之间
                超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止
            提示：
                需要考虑用户在键盘录入时的所有情况
                比如：录入年龄时超出范围，录入年龄时录入了abc等情况
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GirlFriend girlFriend = new GirlFriend();
        while (true) {
            try {
                System.out.println("请输入你心仪女生的姓名：");
                String name = scanner.nextLine();
                girlFriend.setName(name);
                System.out.println("请输入你心仪女生的年龄：");
                String number = scanner.nextLine();
                int age = Integer.parseInt(number);
                girlFriend.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println(girlFriend.toString());
    }
}
