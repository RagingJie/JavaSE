package File.ExerciseDemo;

import java.io.File;

/**
 * @Author
 * @Date 2024/7/1 1:17
 * @Description:
 */
public class Demo04 {

    // 删除多级文件夹

    public static void main(String[] args) {
        File file = new File("src\\File\\ExerciseModule\\bbb");
        delete(file);
    }

    /**
     * @param src 文件路径
     * @return void
     * @author Naruto
     * @date 2024/7/1 1:24
     * @description 删除文件夹
     */
    public static void delete(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            // 遍历获取到的路径资源
            for (File file : files) {
                if (file.isFile()) {
                    // 是文件直接删除
                    file.delete();
                } else {
                    // 是文件继续遍历（递归）
                    delete(file);
                }
            }
        }

        // 删除自己
        src.delete();
    }
}
