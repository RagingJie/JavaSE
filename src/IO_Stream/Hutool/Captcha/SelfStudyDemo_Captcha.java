package IO_Stream.Hutool.Captcha;

import cn.hutool.captcha.*;
import cn.hutool.captcha.generator.MathGenerator;
import cn.hutool.captcha.generator.RandomGenerator;

import java.io.File;
import java.util.Scanner;

/**
 * @Author
 * @Date 2024/7/24 16:15
 * @Description: 练习验证码
 */
public class SelfStudyDemo_Captcha {
    public static void main(String[] args) {
        // 写出图片地址
        File destination = new File("src\\IO_Stream\\Hutool\\Captcha\\验证码.jpg");
        // 创建圆圈干扰验证码
//        createCircleCaptcha(destination, 4, 500);
        // 创建线条干扰验证码
//        createLineCaptcha(destination, 4, 500);
        // 创建扭曲干扰验证码
//        createShearCaptcha(destination, 4, 60);
        // 自定义验证码（纯数字），线条做背景干扰
//        createCustomFigureCaptcha(destination, 4);
        // 自定义验证码（四则运算），线条做背景干扰
//        createCustomArithmeticCaptcha(destination, 4, 500);
        createGifCaptcha(destination, 4);
    }


    /**
     * @param captcha     写出验证码文件
     * @param codeCount   验证码个数
     * @param circleCount 圆圈个数
     * @return void
     * @author Naruto
     * @date 2024/7/24 16:40
     * @description 圆圈干扰验证码，不区分大小写
     */
    private static void createCircleCaptcha(File captcha, int codeCount, int circleCount) {
        // 创建圆圈干扰对象
        CircleCaptcha circleCaptcha = CaptchaUtil.createCircleCaptcha(1200, 400, codeCount, circleCount);
        // 创建验证码
        circleCaptcha.createCode();
        // 获取验证码
        String code = circleCaptcha.getCode();
        // 写出文件，生成验证码图片
        circleCaptcha.write(captcha);
        System.out.println("验证码：" + code);
        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码：");
        // 输入验证码
        String captchaCode = scanner.next();
        // 校验验证码
        boolean isTrue = circleCaptcha.verify(captchaCode);
        String reuslt = isTrue ? "验证通过" : "验证失败";
        System.out.println(reuslt);
    }

    /**
     * @param captcha   写出验证码文件
     * @param codeCount 验证码个数
     * @param lineCount 线条个数
     * @return void
     * @author Naruto
     * @date 2024/7/24 16:46
     * @description 线段干扰的验证码
     */
    private static void createLineCaptcha(File captcha, int codeCount, int lineCount) {
        // 创建线条干扰对象
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(1200, 500, codeCount, lineCount);
        // 生成验证码
        lineCaptcha.createCode();
        // 写出图片
        lineCaptcha.write(captcha);
        // 获取验证码
        String code = lineCaptcha.getCode();
        System.out.println("验证码：" + code);

        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码：");
        // 输入验证码
        String captchaCode = scanner.next();
        // 校验验证码
        boolean isTrue = lineCaptcha.verify(captchaCode);
        String reuslt = isTrue ? "验证通过" : "验证失败";
        System.out.println(reuslt);
    }

    /**
     * @param captcha   写出验证码文件
     * @param codeCount 验证码个数
     * @param thickness 干扰线宽度
     * @return void
     * @author Naruto
     * @date 2024/7/24 17:02
     * @description 干扰线验证码
     */
    private static void createShearCaptcha(File captcha, int codeCount, int thickness) {
        // 创建线条干扰对象
        ShearCaptcha shearCaptcha = CaptchaUtil.createShearCaptcha(1200, 500, codeCount, thickness);
        // 生成验证码
        shearCaptcha.createCode();
        // 写出图片
        shearCaptcha.write(captcha);
        // 获取验证码
        String code = shearCaptcha.getCode();
        System.out.println("验证码：" + code);

        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码：");
        // 输入验证码
        String captchaCode = scanner.next();
        // 校验验证码
        boolean isTrue = shearCaptcha.verify(captchaCode);
        String reuslt = isTrue ? "验证通过" : "验证失败";
        System.out.println(reuslt);
    }

    /**
     * @param captcha   写出验证码文件
     * @param codeCount 验证码个数
     * @return void
     * @author Naruto
     * @date 2024/7/24 17:08
     * @description 自定义验证码（纯数字）
     */
    private static void createCustomFigureCaptcha(File captcha, int codeCount) {
        RandomGenerator randomGenerator = new RandomGenerator("0123456789", codeCount);
        // 创建线条干扰对象
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(1200, 500);
        // 生成验证码
        lineCaptcha.setGenerator(randomGenerator);
        // 重新生成验证码
        lineCaptcha.createCode();
        // 写出图片
        lineCaptcha.write(captcha);
        // 获取验证码
        String code = lineCaptcha.getCode();
        System.out.println("验证码：" + code);

        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码：");
        // 输入验证码
        String captchaCode = scanner.next();
        // 校验验证码
        boolean isTrue = lineCaptcha.verify(captchaCode);
        String reuslt = isTrue ? "验证通过" : "验证失败";
        System.out.println(reuslt);
    }

    /**
     * @param captcha   写出验证码文件
     * @param codeCount 验证码个数
     * @param lineCount 线条个数
     * @return void
     * @author Naruto
     * @date 2024/7/24 17:08
     * @description 自定义验证码（四则运算）
     */
    private static void createCustomArithmeticCaptcha(File captcha, int codeCount, int lineCount) {
        // 创建线条干扰对象
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(1200, 500, codeCount, lineCount);
        // 生成验证码
        lineCaptcha.setGenerator(new MathGenerator());
        // 重新生成验证码
        lineCaptcha.createCode();
        // 写出图片
        lineCaptcha.write(captcha);
        // 获取验证码
        String code = lineCaptcha.getCode();
        System.out.println("验证码：" + code);

        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码：");
        // 输入验证码
        String captchaCode = scanner.next();
        // 校验验证码
        boolean isTrue = lineCaptcha.verify(captchaCode);
        String reuslt = isTrue ? "验证通过" : "验证失败";
        System.out.println(reuslt);
    }

    /**
     * @param captcha
     * @param codeCount
     * @return void
     * @author Naruto
     * @date 2024/7/24 17:28
     * @description
     */
    private static void createGifCaptcha(File captcha, int codeCount) {
        GifCaptcha gifCaptcha = CaptchaUtil.createGifCaptcha(1800, 500, codeCount);
        // 生成验证码
        gifCaptcha.setGenerator(new MathGenerator());
        gifCaptcha.createCode();
        // 写出图片
        gifCaptcha.write(captcha);
        // 获取验证码
        String code = gifCaptcha.getCode();
        System.out.println("验证码：" + code);

        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码：");
        // 输入验证码
        String captchaCode = scanner.next();
        // 校验验证码
        boolean isTrue = gifCaptcha.verify(captchaCode);
        String reuslt = isTrue ? "验证通过" : "验证失败";
        System.out.println(reuslt);
    }
}
