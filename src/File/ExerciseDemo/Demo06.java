package File.ExerciseDemo;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author
 * @Date 2024/7/1 9:44
 * @Description: 统计一个文件夹的大小
 */
public class Demo06 {

    // 需求：统计一个文件夹的大小

    // 定义变量，统计文件大小
    static long len = 0L;

    public static void main(String[] args) {


        File file = new File("src\\File\\ExerciseModule");
        BigDecimal fileSize = getFileSize(file);
        System.out.println("文件大小为：" + fileSize + "MB");

    }

    /**
     * @param src 文件夹路径
     * @return long
     * @author Naruto
     * @date 2024/7/1 9:50
     * @description 获取文件夹大小（返回大小，MB）
     */
    public static BigDecimal getFileSize(File src) {

        File[] files = src.listFiles();
        if (files != null && files.length != 0) {
            for (File file : files) {
                if (file.isFile()) {
                    // 是文件就获取文件大小
                    long length = file.length();
                    len = len + length;
                } else {
                    // 是文件夹就继续深入调用
                    getFileSize(file);
                }
            }
        }

        double result = (double) len / 1024 / 1024;

        BigDecimal bigDecimal = BigDecimal.valueOf(result);

        return bigDecimal.setScale(2, RoundingMode.DOWN);
    }
}
