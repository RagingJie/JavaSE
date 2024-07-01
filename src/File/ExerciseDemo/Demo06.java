package File.ExerciseDemo;

import java.io.File;

/**
 * @Author
 * @Date 2024/7/1 9:44
 * @Description: 统计一个文件夹的大小
 */
public class Demo06 {

    // 需求：统计一个文件夹的大小

    public static void main(String[] args) {


        File file = new File("src\\File\\ExerciseModule");
        long fileSize = getFileSize(file);
        System.out.println("文件大小为：" + fileSize + " 字节(B)");

    }

    /**
     * @param src 文件夹路径
     * @return long
     * @author Naruto
     * @date 2024/7/1 9:50
     * @description 获取文件夹大小（返回大小，B）
     */
    public static long getFileSize(File src) {

        // 定义变量，统计文件大小
        long len = 0L;

        File[] files = src.listFiles();
        if (files != null && files.length != 0) {
            for (File file : files) {
                if (file.isFile()) {
                    // 是文件就获取文件大小
                    long length = file.length();
                    len = len + length;
                } else {
                    // 是文件夹就继续深入调用
                    len = len + getFileSize(file);
                }
            }
        }

        return len;
    }
}
