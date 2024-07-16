package IO_Stream.StudyDemo.PrintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author
 * @Date 2024/7/16 15:55
 * @Description: 字符打印流
 */
public class PrintWriterDemo {

    /*
        字节打印流：
            构造方法
                public PrintWriter(OutputStream/File/String)                关联字节输出流/文件/文件路径
                public PrintWriter(String fileName, Charset charset)        指定字符编码
                public PrintWriter(OutputStream out, boolean autoFlush)     自动刷新
                public PrintWriter(OutputStream out, boolean autoFlush, String encoding) 指定字符编码且自动刷新


            成员方法
                public void write(int b)            常规方法：规则跟之前一样，将指定的字节写出
                public void println(Xxx xx)         特有方法：打印任意数据，自动刷新，自动换行
                public void print(Xxx xx)           特有方法：打印任意数据，不换行
                public void printf(String format, Object... args)  特有方法：带有占位符的打印语句，不换行
     */

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("src\\IO_Stream\\ExerciseFile\\printWriter.txt"), true);

        pw.write(97);
        pw.print(97);
        pw.println();
        pw.println("今天你好啊！！！");
        pw.printf("%s 爱上了 %s", "你", "我");

        pw.close();


    }
}
