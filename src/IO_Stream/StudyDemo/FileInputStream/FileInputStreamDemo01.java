package IO_Stream.StudyDemo.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/1 14:41
 * @Description:
 */
public class FileInputStreamDemo01 {

    // 需求：读取文件中的数据。（暂时不写中文）

    // 实现步骤：
    //      创建对象
    //      读取数据
    //      释放资源

    public static void main(String[] args) throws IOException {
        // 创建对象
        FileInputStream fis = new FileInputStream("src\\IO_Stream\\ExerciseFile\\a.txt");

        // 读取数据
        int r1 = fis.read();
        System.out.println((char) r1);
        int r2 = fis.read();
        System.out.println((char) r2);
        int r3 = fis.read();
        System.out.println((char) r3);
        int r4 = fis.read();
        System.out.println((char) r4);
        int r5 = fis.read();
        System.out.println(r5); // -1 没有数据了
        int r6 = fis.read();
        System.out.println((char) r6); // -1 没有数据了

        // 释放资源
        fis.close();
    }
}
