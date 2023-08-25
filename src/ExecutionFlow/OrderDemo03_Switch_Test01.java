package ExecutionFlow;

/**
 * switch新特性
 *      JDK 12 及以上才可以使用
 *      case 1 -> System.out.println("一");
 *      表达式，版本一下的会报错，无法正常编译运行
 */
public class OrderDemo03_Switch_Test01 {
    public static void main(String[] args) {
        //需求：
        // 1 2 3 ：一、二、三
        int number = 2;
        /*switch (number){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("选项不合法");
                break;
        }*/

        switch (number){
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("选项不合法");
        }
    }
}
