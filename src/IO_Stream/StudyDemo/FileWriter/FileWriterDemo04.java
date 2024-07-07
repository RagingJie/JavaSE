package IO_Stream.StudyDemo.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/8 0:25
 * @Description: void  write(char[]  cbuf)
 */
public class FileWriterDemo04 {

    public static void main(String[] args) throws IOException {
        // 创建对象
        FileWriter fw = new FileWriter("src\\IO_Stream\\ExerciseFile\\eee.txt");

        char[] c = {'a', 'c', 'e', ' ','就', '是', '我', '!'};
        fw.write(c);

        // 释放资源
        fw.close();

    }
}
