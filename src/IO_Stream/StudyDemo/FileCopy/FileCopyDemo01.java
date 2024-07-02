package IO_Stream.StudyDemo.FileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/7/2 21:33
 * @Description: 文件拷贝
 */
public class FileCopyDemo01 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Naruto\\Desktop\\1.mp4");
        FileOutputStream fos = new FileOutputStream("src\\IO_Stream\\ExerciseFile\\adv.mp4");

        int file;
        while ((file = fis.read()) != -1){
            fos.write(file);
        }

        fos.close();
        fis.close();

    }
}
