package IO_Stream.ReviewExercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/8 1:27
 * @Description: 拷贝一个文件夹，考虑子文件夹
 */
public class Exercises02 {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // 数据源
        File dataSource = new File("C:\\Users\\Naruto\\Desktop\\photo");

        // 数据目的地
        File destination = new File("C:\\Users\\Naruto\\Desktop\\destination");

        copyDir(dataSource, destination);

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");
    }

    /**
     * @param dataSource  数据源（文件夹路径）
     * @param destination 目的地（文件夹路径）
     * @return void
     * @author Naruto
     * @date 2024/7/8 10:55
     * @description 拷贝文件
     */
    private static void copyDir(File dataSource, File destination) throws IOException {

        destination.mkdirs();

        if (dataSource.isDirectory()) {
            File[] dataSourceFiles = dataSource.listFiles();

            for (File dataSourceFile : dataSourceFiles) {
                if (dataSourceFile.isFile()) {
                    copyFile(dataSourceFile, new File(destination, dataSourceFile.getName()));
                } else {
                    copyDir(dataSourceFile, new File(destination, dataSourceFile.getName()));
                }
            }
        } else {
            System.out.println("数据源为文件，不做处理");
        }

    }

    /**
     * @param dataSource  数据源（文件路径）
     * @param destination 目的地（文件路径）
     * @return void
     * @author Naruto
     * @date 2024/7/8 10:55
     * @description 拷贝文件
     */
    private static void copyFile(File dataSource, File destination) throws IOException {

        // 读取数据源
        FileInputStream fis = new FileInputStream(dataSource);

        // 写出数据
        FileOutputStream fos = new FileOutputStream(destination);

        byte[] transmitSize = new byte[1024 * 1024 * 5];  // 5MB

        int len;
        while ((len = fis.read(transmitSize)) != -1) {
            fos.write(transmitSize, 0, len);
        }

        // 释放资源
        fos.close();
        fis.close();

    }

}
