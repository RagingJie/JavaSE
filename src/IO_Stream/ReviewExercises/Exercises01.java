package IO_Stream.ReviewExercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/7 14:38
 * @Description: 复习拷贝文件
 */
public class Exercises01 {
    public static void main(String[] args) throws IOException {

        File dataSource = new File("C:\\Users\\Naruto\\Desktop\\源文件.txt");
        File destinationSource = new File("C:\\Users\\Naruto\\Desktop\\目的文件.txt");

        FileInputStream fis = new FileInputStream(dataSource);
        FileOutputStream fos = new FileOutputStream(destinationSource);

        byte[] transmissionSize = new byte[1024 * 1024 * 5];  // 5MB

        while (fis.read(transmissionSize) != -1) {
            fos.write(transmissionSize);
        }

        // 释放资源
        fos.close();
        fos.close();
    }
}
