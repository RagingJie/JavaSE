package IO_Stream.StudyIO.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/1 14:01
 * @Description:
 */
public class FileOutputStreamDemo04 {

    // void write(byte[] b, int off, int len)    一次写一个字节数组的部分数据

    public static void main(String[] args) throws IOException {

        // 1.创建对象,会将文件种的内容清空
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\c.txt");

        byte[] bytes = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        // 2.写出数据
        fos.write(bytes, 8, 5);

        // 释放资源
        fos.close();
    }
}
