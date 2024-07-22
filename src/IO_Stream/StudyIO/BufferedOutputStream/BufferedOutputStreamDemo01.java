package IO_Stream.StudyIO.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/8 15:16
 * @Description: 字节缓冲输出流(字节数组参数)
 */
public class BufferedOutputStreamDemo01 {

    public static void main(String[] args) throws IOException {

        // 字节缓冲输出流构造方法
        // public BufferedOutputStream(OutputStream out)

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\IO_Stream\\ExerciseFile\\xxx.txt"));

        String str = "你是个大帅锅！！！";
        byte[] bytes = str.getBytes();

        bos.write(bytes);

        bos.close();


    }
}
