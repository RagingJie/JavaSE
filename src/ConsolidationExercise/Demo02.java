package ConsolidationExercise;

/**
 * 求101~200之间的素数有多少个并打印
 */
public class Demo02 {
    public static void main(String[] args) {
        int count = 0;
        //列出101~200中的每个数字
        for (int i = 101; i <= 200; i++) {
            //逻辑标识
            boolean flag = true;
            //判断当前数字是否是素数
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("当前数字"+i+"是一个素数~");
                count++;
            }
        }
        System.out.println("共有"+count+"个数字为素数~");
    }
}
