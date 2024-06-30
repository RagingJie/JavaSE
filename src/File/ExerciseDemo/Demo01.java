package File.ExerciseDemo;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/6/28 15:23
 * @Description:
 */
public class Demo01 {

    // 在练习模块包中的aaa文件夹下创建一个a.txt文件

    public static void main(String[] args) throws IOException {
        // 创建文件路径
        File file = new File("src\\File\\ExerciseModule\\aaa");
        // 首先创建文件夹
        file.mkdirs();
        // 文件路径
        File src = new File(file, "\\a.txt");
        if (src.createNewFile()) {
            System.out.println("文件【a.txt】，创建成功！");
        } else {
            System.out.println("文件【a.txt】已存在，创建失败！");
        }

    }
}
