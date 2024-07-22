package IO_Stream.StudyIO.FileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/2 21:33
 * @Description: 文件拷贝（读取时使用字节数组）
 */
public class FileCopyDemo03 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\Naruto\\Desktop\\1.mp4");
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\test.mp4");

        byte[] bytes = new byte[1024 * 1024 * 5];  // 5MB的内存

        int length = 0;

        // 拷贝
        int len;
        while ((len = fis.read(bytes)) != -1) {
            length += len;
            fos.write(bytes, 0, len);  // 每次写出是按照索引0到读取的长度，写出，避免写多了
        }

        long end = System.currentTimeMillis();

        System.out.println("文件大小为：" + length + " 字节(B)");
        System.out.println("文件拷贝花费时间：" + ((end - start) / 1000.0) + "s");

        // 释放资源
        fos.close();
        fis.close();

    }
}
