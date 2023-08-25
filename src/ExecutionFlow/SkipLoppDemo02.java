package ExecutionFlow;

/**
 * break：结束当前{}中的循环
 */
public class SkipLoppDemo02 {
    public static void main(String[] args) {
        for (int j = 1; j <= 2; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("小老虎吃第" + i + "个包子");
                if (i == 3) {
                    System.out.println("================================");
                    break;
                }
            }
        }

    }
}
