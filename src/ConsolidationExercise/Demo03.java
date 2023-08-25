package ConsolidationExercise;

import java.util.Random;

//  验证码

/**
 * 需求:
 * 定义方法实现随机产生一个5位的验证码验证码格式:
 * 长度为5
 * 前四位是大写字母或者小写字母
 * 最后一位是数字
 */
public class Demo03 {
    public static void main(String[] args) {
        //方法：
        //在以后如果我们要在一堆没有什么规律的数据中随机抽取
        //可以先把这些数据放到数组中
        //再随机抽取一个索引

        //分析；
        //1.大小写字母都放在数组中
        //ASCII码表
        String s = generateCode();
        System.out.println("generateCode方法生成的验证码为："+s);


        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (97 + i);
        }
        for (int i = 26, j = 0; i < chars.length; i++, j++) {
            chars[i] = (char) (65 + j);
        }
       /* for (char aChar : chars) {
            System.out.print(aChar+" ");
        }*/

        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(chars.length);
            char aChar = chars[index];
            stringBuilder.append(aChar);
        }

        int number = random.nextInt(10);
        stringBuilder.append(number);
        String[] split = stringBuilder.toString().split("");
        StringBuilder stringBuilder1 = new StringBuilder();
        //在原来生成的验证码基础上再次提取，随机打乱
        for (int i = 0; i < split.length; i++) {
            int index = random.nextInt(split.length);
            stringBuilder1.append(split[index]);
        }
        System.out.println("验证码为：" + stringBuilder);
        System.out.println("验证码为：" + stringBuilder1);
    }


    public static String generateCode() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        // 生成前四位字母
        for (int i = 0; i < 4; i++) {
            // 随机生成0或1，0表示小写字母，1表示大写字母
            int type = random.nextInt(2);
            char c = 0;
            if (type == 0) {
                // 生成小写字母
                c = (char) (random.nextInt(26) + 'a');
            } else {
                // 生成大写字母
                c = (char) (random.nextInt(26) + 'A');
            }
            sb.append(c);
        }
        // 生成最后一位数字
        int num = random.nextInt(10);
        sb.append(num);
        return sb.toString();
    }
}
