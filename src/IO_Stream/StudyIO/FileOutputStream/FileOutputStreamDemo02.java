package IO_Stream.StudyIO.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/1 14:01
 * @Description:
 */
public class FileOutputStreamDemo02 {

    // void write(int b)                         一次写一个字节数据

    public static void main(String[] args) throws IOException {

        // 1.创建对象,会将文件种的内容清空
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\a.txt");

        // 2.写出数据
        fos.write(49);
        fos.write(50);
        fos.write(51);
        fos.write(52);

        // 释放资源
        fos.close();
    }
}
