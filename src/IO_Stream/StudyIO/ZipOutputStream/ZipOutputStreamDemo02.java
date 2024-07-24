package IO_Stream.StudyIO.ZipOutputStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Author
 * @Date 2024/7/24 9:12
 * @Description: 压缩文件夹
 */
public class ZipOutputStreamDemo02 {

    public static void main(String[] args) throws IOException {

        // 数据源
        File dataSource = new File("C:\\Users\\Naruto\\Desktop\\加压");
        // 父级文件
        File parentFile = dataSource.getParentFile();
        // 目的地
        File destination = new File(parentFile, dataSource.getName() + ".zip");
        // 创建压缩输出流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(destination));
        // 压缩文件夹
        compressedDirectory(dataSource, zos, "");
        // 释放资源
        zos.close();

    }

    /**
     * @param dataSource 数据源
     * @param zos        压缩输出流
     * @param name       文件夹名
     * @return void
     * @author Naruto
     * @date 2024/7/24 11:13
     * @description 压缩文件夹
     */
    private static void compressedDirectory(File dataSource, ZipOutputStream zos, String name) throws IOException {
        // 获取本文件夹中所有的文件及文件夹【不包含下一层的文件夹中的文件】
        File[] files = dataSource.listFiles();
        for (File file : files) {
            System.out.println(file);
            if (file.isFile()) {
                // 压缩包中的每个文件都是一个ZipEntry对象
                ZipEntry zip = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(zip);
                // 创建字节输入流，读取文件内容
                FileInputStream fis = new FileInputStream(file);
                byte[] readSpeed = new byte[1024 * 5];  // 读写速度为：5KB
                int len;
                while ((len = fis.read(readSpeed)) != -1) {
                    zos.write(readSpeed, 0, len);
                }
                // 结束本次压缩文件操作
                zos.closeEntry();
            } else {
                compressedDirectory(file, zos, file.getName());
            }
        }
    }

}
