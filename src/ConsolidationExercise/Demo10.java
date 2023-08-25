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
public class Demo10 {
    public static void main(String[] args) {

        int[] arr = {2, 1000, 10000, 888, 588, 666};

        //1.打乱奖池中的顺序
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int indexRandom = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[indexRandom];
            arr[indexRandom] = temp;
        }

        //2.遍历数组
        for (int i : arr) {
            System.out.println(i + "元的奖金被抽出");
        }
    }
}
