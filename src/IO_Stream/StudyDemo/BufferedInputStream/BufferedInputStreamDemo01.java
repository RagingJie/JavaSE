package IO_Stream.StudyDemo.BufferedInputStream;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/8 14:52
 * @Description: 字节缓冲输入流（读取一个字节）
 */
public class BufferedInputStreamDemo01 {

    public static void main(String[] args) throws IOException {

        // 字节缓冲流构造方法
        // public BufferedInputStream(InputStream in)

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\IO_Stream\\ExerciseFile\\theSunIsNotDryAndTheBreezeIsJustRight.txt"));

        // 一次读取一个字节，
        // 中文：
        //      GBK：2个字节
        //      unicode(UTF-8)：3个字节
        int len;
        while ((len = bis.read()) != -1) {
            System.out.print(len);  // 乱码是因为utf-8中，中文占用三个字节，而每次读一个字节，不能正常解析，所以乱码
        }

        bis.close();
    }
}
