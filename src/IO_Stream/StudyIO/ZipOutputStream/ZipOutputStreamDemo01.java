package IO_Stream.StudyIO.ZipOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Author
 * @Date 2024/7/23 17:12
 * @Description: 压缩单个文件
 */
public class ZipOutputStreamDemo01 {

    public static void main(String[] args) throws IOException {

        // 数据源
        File dataSource = new File("C:\\Users\\Naruto\\Desktop\\Java学习笔记过度.md");
        // 目的地
        File destination = new File("C:\\Users\\Naruto\\Desktop\\");

        compressedFiles(dataSource, destination);

    }

    /**
     * @param dataSource  数据源
     * @param destination 目的地
     * @return void
     * @author Naruto
     * @date 2024/7/23 17:21
     * @description 解压文件
     */
    private static void compressedFiles(File dataSource, File destination) throws IOException {
        // 压缩输出流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(destination, "压缩.zip")));
        ZipEntry entry = new ZipEntry(dataSource.getName());
        zos.putNextEntry(entry);

        // 读写文件内容
        FileInputStream fis = new FileInputStream(dataSource);
        byte[] readSpeed = new byte[1024 * 1024 * 2]; // 2MB的读写速度
        int len;
        while ((len = fis.read(readSpeed)) != -1) {
            zos.write(readSpeed, 0, len);
        }
        fis.close();


        zos.closeEntry();
        zos.close();

    }
}
