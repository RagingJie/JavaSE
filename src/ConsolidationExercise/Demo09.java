package ConsolidationExercise;

import java.util.Random;

/**
 * 需求：
 * 一个大V直播抽奖，奖品是现金红包，分别有{2，588,888,1000,10000}五个奖金。
 * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
 * 打印效果如下:（随机顺序，不一定是下面的顺序)
 * 888元的奖金被抽出
 * 588元的奖金被抽出
 * 10000元的奖金被抽出
 * 1000元的奖金被抽出
 * 2元的奖金被抽出
 */
public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {2, 1000, 10000, 888, 588, 666};
        int[] arrNew = new int[arr.length];
        int index = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; ) {
            int number = random.nextInt(arr.length);
            boolean flag = false;
            for (int j = 0; j < arrNew.length; j++) {
                if (arrNew[j] == arr[number]) {
                    flag = true;
                }
            }
            if (!flag) {
                arrNew[index] = arr[number];
                index++;
                i++;
            }
        }
        for (int i = 0; i < arrNew.length; i++) {
            System.out.println(arrNew[i]+"元的奖金被抽出");
        }
    }
}
