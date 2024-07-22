package IO_Stream.StudyIO.FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/2 21:33
 * @Description: 文件拷贝（读取时使用字节数组）|| 使用 try...catch...finally捕获异常
 */
public class FileCopyDemo06 {

    /*
           JDK9：IO流中补货异常的方法
               try后面的小括号中写创建对象的变量名，
                   注意：只有实现了AutoCloseable接口的类，才能在小括号中创建对象

           try (){

            } catch (){

           }
     */

    public static void main(String[] args) throws FileNotFoundException {

        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\Naruto\\Desktop\\1.mp4");
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\test.mp4");

        try (fis; fos) {

            byte[] bytes = new byte[1024 * 1024 * 5];  // 5MB的内存

            int length = 0;

            // 拷贝
            int len;
            while ((len = fis.read(bytes)) != -1) {
                length += len;
                fos.write(bytes, 0, len);  // 每次写出是按照索引0到读取的长度，写出，避免写多了
            }

            long end = System.currentTimeMillis();

            System.out.println("文件大小为：" + length + " 字节(B)");
            System.out.println("文件拷贝花费时间：" + ((end - start) / 1000.0) + "s");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
