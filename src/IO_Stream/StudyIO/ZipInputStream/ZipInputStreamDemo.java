package IO_Stream.StudyIO.ZipInputStream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @Author
 * @Date 2024/7/22 23:37
 * @Description: 解压缩流，加压压缩文件
 */
public class ZipInputStreamDemo {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 创建数据源文件
        File dataSource = new File("C:\\Users\\Naruto\\Desktop\\photo.zip");
        // 创建加压文件目的地
        File destination = new File("C:\\Users\\Naruto\\Desktop\\解压");
        // 解压文件
        decompression(dataSource, destination);

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + (end - start) / 1000.0 + "s");

    }

    /**
     * @param dataSource  数据源
     * @param destination 解压目的地
     * @return void
     * @author Naruto
     * @date 2024/7/22 23:40
     * @description 解压文件
     */
    public static void decompression(File dataSource, File destination) throws IOException {
        // 解压的本质：把压缩包里面的每一个文件或者文件夹读取出来，按照层级拷贝到目的地当中

        // 创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(dataSource), Charset.forName("GBK"));
        // 要先获取到压缩包中的每一个zipEntry对象
//        for (int i = 0; i < 100; i++) {
//            ZipEntry entry = zip.getNextEntry();
//            System.out.println(entry);
//        }
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);

            if (entry.isDirectory()) {
                // 文件夹：需要在目的地destination处创建一个同样的文件夹
                File file = new File(destination, entry.toString());
                file.mkdirs();
            } else {
                // 文件：需要读取到压缩包中的文件，并把他存放到目的地destination文件夹中（按照层级目录进行存放）
                FileOutputStream fos = new FileOutputStream(new File(destination, entry.toString()));
                byte[] readSpeed = new byte[1024 * 1024 * 5];  // 读取速度为5MB
                int len;
                while ((len = zip.read(readSpeed)) != -1) {
                    fos.write(readSpeed, 0, len);
                }
                fos.close();
                // 表示压缩包中的一个文件处理完毕了
                zip.closeEntry();
            }
        }

        zip.close();
    }
}
