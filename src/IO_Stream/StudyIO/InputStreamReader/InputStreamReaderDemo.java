package IO_Stream.StudyIO.InputStreamReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @Author
 * @Date 2024/7/9 16:13
 * @Description: InputStreamReader转换输入流（jdk11之前）    jdk11之后，就用他的子类去实现 FileReader
 */
public class InputStreamReaderDemo {

    /*
            利用转换流按照指定字符编码读取（了解）

            因为JDK11：这种方式被淘汰了。代替方案（掌握）
     */


    // 读取使用GBK字符集的文件
    public static void main(String[] args) throws IOException {

       /* // 数据源
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\IO_Stream\\ExerciseFile\\read.txt"), "GBK");

        // 读取数据
        int read;
        while ((read = isr.read()) != -1) {
            System.out.print((char) read);
        }

        isr.close();*/


        // 数据源
        FileReader fr = new FileReader("src\\IO_Stream\\ExerciseFile\\read.txt", Charset.forName("GBK"));

        // 读取数据
        int read;
        while ((read = fr.read()) != -1) {
            System.out.print((char) read);
        }

        // 释放资源
        fr.close();
    }
}
