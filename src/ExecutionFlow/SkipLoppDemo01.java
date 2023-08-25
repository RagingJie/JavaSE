package ExecutionFlow;

/**
 *  continue：跳出本次循环，执行下一次循环
 */
public class SkipLoppDemo01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("小老虎吃第" + i + "个包子");
        }
    }
}
