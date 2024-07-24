package IO_Stream.CommonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/24 14:23
 * @Description:
 */
public class CommonsIODemo {

    public static void main(String[] args) throws IOException {

        // 拷贝文件
//        copyFile();
        // 拷贝文件夹
//        copyDirectory();
        // 删除文件夹
//        deleteDirectory();
        // 清空文件夹
        cleanDirectory();

    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/24 14:42
     * @description 清空文件夹
     */
    private static void cleanDirectory() throws IOException {
        File src = new File("C:\\Users\\Naruto\\Desktop\\stcz");
        FileUtils.cleanDirectory(src);
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/24 14:38
     * @description 删除文件夹
     */
    private static void deleteDirectory() throws IOException {
        // 数据源
        File dataSource = new File("C:\\Users\\Naruto\\Desktop\\aaa");
        FileUtils.deleteDirectory(dataSource);
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/24 14:33
     * @description 拷贝文件
     */
    private static void copyFile() throws IOException {
        // 数据源
        File dataSource = new File("C:\\Users\\Naruto\\Desktop\\aaa.txt");

        // 目的地文件
        File destination = new File("C:\\Users\\Naruto\\Desktop\\ccc.txt");

        // 拷贝文件
        // 没有目标文件时，会自动创建一个文件
        FileUtils.copyFile(dataSource, destination);
    }

    /**
     * @return void
     * @author Naruto
     * @date 2024/7/24 14:35
     * @description 拷贝文件夹
     */
    private static void copyDirectory() throws IOException {
        // 数据源
        File dataSource = new File("C:\\Users\\Naruto\\Desktop\\食堂称重");

        // 目的地文件
        File destination = new File("C:\\Users\\Naruto\\Desktop\\stcz");

        // 将文件夹中的所有内容完全一样的复制到另一个文件夹中
        FileUtils.copyDirectory(dataSource, destination);
        // 将整个文件夹复制到另一个文件夹下
//        FileUtils.copyDirectoryToDirectory(dataSource, destination);
    }

}
