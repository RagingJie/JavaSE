package IO_Stream.StudyIO.FileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/7 23:54
 * @Description: read(char[] c)方法，带参数
 */
public class FileReaderDemo02 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        // 创建对象
        FileReader fr = new FileReader("src\\IO_Stream\\ExerciseFile\\fff.txt");

        char[] readDataChar = new char[5];  // 每次读5个字符

        int len;
        while ((len = fr.read(readDataChar)) != -1) {
            System.out.print(new String(readDataChar, 0, len));
        }

        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println();

        System.out.println("运行时间：" + ((end - start) / 1000.0) + "s");

        // 释放资源
        fr.close();
    }

}
