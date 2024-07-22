package IO_Stream.StudyIO.PrintStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * @Author
 * @Date 2024/7/16 15:32
 * @Description: 字节打印流
 */
public class PrintStreamDemo01 {
    /*
        字节打印流：
            构造方法
                public PrintStream(OutputStream/File/String)                关联字节输出流/文件/文件路径
                public PrintStream(String fileName, Charset charset)        指定字符编码
                public PrintStream(OutputStream out, boolean autoFlush)     自动刷新
                public PrintStream(OutputStream out, boolean autoFlush, String encoding) 指定字符编码且自动刷新


            成员方法
                public void write(int b)            常规方法：规则跟之前一样，将指定的字节写出
                public void println(Xxx xx)         特有方法：打印任意数据，自动刷新，自动换行
                public void print(Xxx xx)           特有方法：打印任意数据，不换行
                public void printf(String format, Object... args)  特有方法：带有占位符的打印语句，不换行
     */


    public static void main(String[] args) throws IOException {

        // 1.创建打印字节流对象
        PrintStream ps = new PrintStream(new FileOutputStream("src\\IO_Stream\\ExerciseFile\\print.txt"), true, Charset.forName("UTF-8"));

        // 2.写出数据
        ps.println(97);
        ps.println(98); // 自动换行
        ps.print(true);  // 不换行
        ps.println(); // 换行
        ps.printf("%s 爱上了 %s", "宗杰", "波妞");

        // 3.释放资源
        ps.close();
    }
}
