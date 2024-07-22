package IO_Stream.StudyIO.Charset;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/3 0:11
 * @Description:
 */
public class CharsetDemo01 {

    /**
     * 字节流读取中文会出现乱码
     */


    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\IO_Stream\\ExerciseFile\\d.txt");

        int val;
        while ((val = fis.read()) != -1) {
            System.out.print((char) val);
        }

        fis.close();
    }
}
