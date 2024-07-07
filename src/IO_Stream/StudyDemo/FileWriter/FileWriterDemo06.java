package IO_Stream.StudyDemo.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/8 0:25
 * @Description: 续写
 */
public class FileWriterDemo06 {

    public static void main(String[] args) throws IOException {
        // 创建对象
        FileWriter fw = new FileWriter("src\\IO_Stream\\ExerciseFile\\eee.txt", true);

        // ‘我’ ： 25105

        fw.write(25105);  // “我”对应的十进制

        // 释放资源
        fw.close();

    }
}
