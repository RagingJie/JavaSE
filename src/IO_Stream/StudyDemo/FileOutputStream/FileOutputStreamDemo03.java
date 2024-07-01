package IO_Stream.StudyDemo.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/1 14:01
 * @Description:
 */
public class FileOutputStreamDemo03 {

    // void write(byte[] b)                      一次写一个字节数组数据

    public static void main(String[] args) throws IOException {

        // 1.创建对象,会将文件种的内容清空
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\b.txt");

        byte[] bytes = {97, 98, 99, 100, 101};

        // 2.写出数据
        fos.write(bytes);

        // 释放资源
        fos.close();
    }
}
