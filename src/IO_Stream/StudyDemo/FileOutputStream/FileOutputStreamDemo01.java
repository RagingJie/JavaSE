package IO_Stream.StudyDemo.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/1 11:14
 * @Description:
 */
public class FileOutputStreamDemo01 {

    //  需求：写出一段文字到本地文件中。（暂时不写中文）
    //
    //  实现步骤：
    //        创建对象
    //        写出数据
    //        释放资源
    public static void main(String[] args) throws IOException {

        // 创建对象
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\a.txt");
        // 写入数据
        fos.write(98);
        // 释放资源
        fos.close();

    }
}
