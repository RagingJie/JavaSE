package ExecutionFlow;

/**
 * 朋友聚会的时候可能会玩一个游戏:逢7过
 * 游戏规则:从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过:过
 * 需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
 */
public class SkipLoppDemo03 {
    public static void main(String[] args) {
        int[] result = new int[100];
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println("过");
                continue;
            }
            result[a] = i;
            a++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.length && result[i] !=0; i++) {
            stringBuilder.append(result[i] + ",");
        }
        System.out.println(stringBuilder);
    }
}
