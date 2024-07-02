package IO_Stream.StudyDemo.Charset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/3 0:11
 * @Description:
 */
public class CharsetDemo02 {

    /**
     * 文件拷贝过程中，不会出现乱码
     */


    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\IO_Stream\\ExerciseFile\\d.txt");
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\ddd.txt");

        int val;
        while ((val = fis.read()) != -1) {
            fos.write(val);
        }
    }
}
