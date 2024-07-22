package IO_Stream.StudyIO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/8 0:25
 * @Description:  void  write(int  c)
 */
public class FileWriterDemo01 {

    public static void main(String[] args) throws IOException {
        // 创建对象
        FileWriter fw = new FileWriter("src\\IO_Stream\\ExerciseFile\\eee.txt");

        // ‘我’ ： 25105

        fw.write(25105);  // “我”对应的十进制

        // 释放资源
        fw.close();

    }
}
