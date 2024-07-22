package IO_Stream.StudyIO.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author
 * @Date 2024/7/9 17:16
 * @Description: 序列化流 / 对象操作输出流
 */
public class ObjectOutputStreamDemo {

    /*
            需求：
                利用序列化流 / 对象操作输出流，把一个对象写到本地文件中

             构造方法
                 public  ObjectOutputStream(OutputStream  out)   把基本流包装成高级流

             成员方法
                 public final void writeObject(object  obj)      把对象序列化（写出）到文件中去

     */
    public static void main(String[] args) throws IOException {

        // 创建学生对象
        Student naruto = new Student("Naruto", 18, 180.3, "深圳");

        // 创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\IO_Stream\\ExerciseFile\\objectWrite.txt"));

        // 写出数据
        oos.writeObject(naruto);

        // 释放资源
        oos.close();
    }
}
