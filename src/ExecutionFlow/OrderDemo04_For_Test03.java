package ExecutionFlow;

/**
 * 计算1~100的和
 */
public class OrderDemo04_For_Test03 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++){
            num += i;
        }
        System.out.println("1~5的和为："+num);
    }
}
