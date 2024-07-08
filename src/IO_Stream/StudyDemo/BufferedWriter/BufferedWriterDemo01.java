package IO_Stream.StudyDemo.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/9 0:41
 * @Description: 字符缓冲输出流
 */
public class BufferedWriterDemo01 {

    /*

            字符缓冲输出流
                构造方法：
                     public BufferedWriter(Writer out)
                特有方法：
                     public void newLine()      跨平台换行
     */

    public static void main(String[] args) throws IOException {

        // 创建对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\IO_Stream\\ExerciseFile\\yyy.txt"));

        // 写出数据
        bw.write("I LOVE Naruto!");
        bw.newLine();
        bw.write("你喜欢吗？");
        bw.newLine();
        bw.write("Are you ready？");

        // 释放资源
        bw.close();
    }
}
