package File.ExerciseDemo;

import java.io.File;

/**
 * @Author
 * @Date 2024/6/30 19:01
 * @Description:
 */
public class Demo03 {

    // 找到电脑中所有以avi结尾的电影 (需要考虑子文件夹)
    // 递归的思想

    public static void main(String[] args) {
        haveAVi();
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/6/30 19:20
     * @description 获取电脑中所有以avi结尾的文件夹
     */
    public static void haveAVi() {
        File[] files = File.listRoots();
        if (files != null) {
            for (File file : files) {
                haveAVi(file);
            }
        }
    }

    /**
     * @param src 文件路径
     * @return void
     * @author Naruto
     * @date 2024/6/30 19:19
     * @description 获取以avi结尾的文件夹
     */
    public static void haveAVi(File src) {
        // listFiles遍历时，里面有访问权限的文件夹，返回值为null
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                // 判断是否是文件，是文件打印以avi文件名称
                String name = file.getName();
                if (file.isFile() && name.endsWith(".avi")) {
                    //文件处理
                    System.out.println(file);
                } else {
                    // 文件夹处理
                    haveAVi(file);
                }
            }
        }
    }
}
