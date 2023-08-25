package ExecutionFlow;

/**
 * 求：1~100之间的偶数和
 */
public class OrderDemo04_While_Test04 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0){
                num += i;
            }
        }
        System.out.println(num);
    }
}
