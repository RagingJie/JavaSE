package IO_Stream.StudyIO.ObjectInputStream;

import IO_Stream.StudyIO.ObjectOutputStream.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author
 * @Date 2024/7/10 0:07
 * @Description: 反序列化流 / 对象操作输入流
 */
public class ObjectInputStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\IO_Stream\\ExerciseFile\\objectWrite.txt"));

//        Object naruto = ois.readObject();

        Student naruto = (Student) ois.readObject();
        System.out.println(naruto);

        ois.close();

    }
}
