package IO_Stream.StudyDemo.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/8 0:25
 * @Description: void  write(String  str,  int  off,  int  len)
 */
public class FileWriterDemo03 {

    public static void main(String[] args) throws IOException {
        // 创建对象
        FileWriter fw = new FileWriter("src\\IO_Stream\\ExerciseFile\\eee.txt");

        fw.write("你好吗？朋友" +
                "\r\n" +
                "yes！我很好", 4,2);

        // 释放资源
        fw.close();

    }
}
