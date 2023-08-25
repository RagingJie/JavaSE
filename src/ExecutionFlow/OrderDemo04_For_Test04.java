package ExecutionFlow;

/**
 * 计算1~100中的偶数和
 */
public class OrderDemo04_For_Test04 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++){
            if (i%2==0){
                num += i;
            }else {
                continue;
            }
        }
        System.out.println("1~100的偶数和为："+num);
    }
}
