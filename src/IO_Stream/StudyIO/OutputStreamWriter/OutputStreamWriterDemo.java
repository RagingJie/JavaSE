package IO_Stream.StudyIO.OutputStreamWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @Author
 * @Date 2024/7/9 16:31
 * @Description: OutputStreamWriter转化输出流(JDK之前)，之后用了FileWriter代替实现
 */
public class OutputStreamWriterDemo {

    /*
            利用转换流按照指定字符编码写出（了解）

            因为JDK11：这种方式被淘汰了。代替方案（掌握）
     */
    public static void main(String[] args) throws IOException {

     /*   // 创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\IO_Stream\\ExerciseFile\\write.txt"), "GBK");

        // 写出数据
        String writeContent = "你好啊，帅锅";

        osw.write(writeContent);

        // 释放资源
        osw.close();*/


        // 代替方案
        FileWriter fw = new FileWriter("src\\IO_Stream\\ExerciseFile\\write.txt", Charset.forName("GBK"));
        String writeContent = "你好啊，帅锅";
        fw.write(writeContent);
        fw.close();

    }
}
