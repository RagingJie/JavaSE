package IO_Stream.StudyDemo.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/9 0:39
 * @Description: 字符缓冲输入流
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        /*

                字符缓冲输入流：
                    构造方法：
                        public BufferedReader(Reader r)
                    特有方法：
                        public String readLine()  读一整行

                        细节： readLine方法在读取的时候，一次读一整行，遇到回车换行结束
                                但是他不会把【回车】换行读到内存中
         */

        // 创建对象
        BufferedReader br = new BufferedReader(new FileReader("src\\IO_Stream\\ExerciseFile\\theSunIsNotDryAndTheBreezeIsJustRight.txt"));

        // 读取数据
//        String line1 = br.readLine();
//        System.out.print(line1);
//        String line2 = br.readLine();
//        System.out.print(line2);
//        String line3 = br.readLine();
//        System.out.print(line3);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
