package IO_Stream.StudyDemo.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/1 14:41
 * @Description:
 */
public class FileInputStreamDemo03 {

    /*
     *  字节输入流循环读取
     *
     *
     *  read：表示读取数据，而且是读取一个数据就移动一次指针
     *
     */

    public static void main(String[] args) throws IOException {
        // 创建对象
        FileInputStream fis = new FileInputStream("src\\IO_Stream\\ExerciseFile\\b.txt");

        // 循环读取数据
        int read;
        while ((read = fis.read()) != -1) {
            System.out.print((char) read);
        }

        // 释放资源
        fis.close();
    }
}
