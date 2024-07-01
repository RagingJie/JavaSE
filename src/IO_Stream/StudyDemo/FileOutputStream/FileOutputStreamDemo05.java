package IO_Stream.StudyDemo.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/1 14:01
 * @Description:
 */
public class FileOutputStreamDemo05 {

    // - 换行
    //  - 再次写出一个换行符就可以了
    //    - windows：\r\n
    //    - Linux：\n
    //    - Mac：\r
    //  - 细节：
    //    - 在windows系统中，java对回车换行进行了优化。虽然完整的是\r\n，但是我们写其中一个\r或者\n，java也可以实现换行，因为java在底层会补全。
    //  - 建议：
    //    - 不要省略，还是写全了。
    //
    //
    //
    // - 续写
    //  - 如果想要续写，打开续写开关即可
    //  - 开关位置：创建对象的第二个参数
    //  - 默认false：表示关闭续写，此时创建对象会清空文件
    //  - 手动传递true，表示打开续写，此时创建对象不会清空文件

    public static void main(String[] args) throws IOException {

        // 换行写+续写

        // 1.创建对象,会将文件种的内容清空
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\d.txt", true);

        // 2.写出数据

        String newline = "\r\n";
        byte[] bytes2 = newline.getBytes();
        fos.write(bytes2);

        String str1 = "你是帅哥！！";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        fos.write(bytes2);

        String str2 = "666";
        byte[] bytes3 = str2.getBytes();
        fos.write(bytes3);

        // 释放资源
        fos.close();
    }
}
