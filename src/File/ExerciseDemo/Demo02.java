package File.ExerciseDemo;

import java.io.File;

/**
 * @Author Naruto
 * @Date 2024/6/30 18:48
 * @Description:
 */
public class Demo02 {

    // 定义一个方法找某一个文件夹中，是否有以avi结尾的电影。（暂时不需要考虑子文件夹）

    public static void main(String[] args) {
        File file = new File("src\\File\\ExerciseModule\\aaa");
        boolean b = haveAVI(file);
        System.out.println("是否存在文件：" + b);
    }

    /**
     * @param file 文件夹路径
     * @return boolean
     * @author Naruto
     * @date 2024/6/30 18:51
     * @description 检测是否有以avi结尾的电影
     */
    public static boolean haveAVI(File file) {
        File[] files = file.listFiles();
        // 先判断是否为空，避免索引越界问题
        if (files.length == 0) return false;

        for (File item : files) {
            if (item.isFile() && item.getName().endsWith(".avi")) return true;
        }
        return false;
    }
}
