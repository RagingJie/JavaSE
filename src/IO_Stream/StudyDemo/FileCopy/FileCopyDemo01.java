package IO_Stream.StudyDemo.FileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/2 21:33
 * @Description: 文件拷贝
 */
public class FileCopyDemo01 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\Naruto\\Desktop\\1.mp4");
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\adv.mp4");

        // 核心思想
        // 边写边读
        int file;
        while ((file = fis.read()) != -1) {
            fos.write(file);
        }

        long end = System.currentTimeMillis();
        System.out.println("文件拷贝花费时间：" + ((end - start) / 1000.0) + "s");

        // 释放资源
        fos.close();
        fis.close();

    }
}
