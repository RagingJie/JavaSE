package Student_Management_System;

import java.util.Random;

/**
 * 验证码工具
 */
public class VerificationCodeUtil {
    /**
     * 生成验证码
     * @return
     */
    public static String createCaptcha() {
        StringBuilder letters = new StringBuilder();
        Random random = new Random();

        //验证码中的字母
        char[] chars = new char[52];
        //将小写字母存入数组
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) (97 + i);
        }
        //将大写字母写入数组
        for (int i = 26, j = 0; i < 52; i++, j++) {
            chars[i] = (char) (65 + j);
        }

        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(52);
            letters.append(chars[index]);
        }

        //数字的取值范围就是0~9   验证码中的数字
        int number = random.nextInt(10);  //0~10之间的数字，不包含10
        //数字插入全是字母的验证码的索引
        int index = random.nextInt(5);
        //生成符合规则的二维码：4个字母与1个数组组合，字母可重复出现
        String captcha = letters.replace(index, index + 1, Integer.toString(number)).toString();

        return captcha;
    }
}
