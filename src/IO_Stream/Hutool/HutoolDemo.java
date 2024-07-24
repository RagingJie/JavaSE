package IO_Stream.Hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author
 * @Date 2024/7/24 15:25
 * @Description:
 */
public class HutoolDemo {
    /*
            FileUtil类：
                file：根据参数创建一个file对象
                touch：根据参数创建文件

                writeLines：把集合中的数据写出到文件中，覆盖模式
                appendLines：把集合中的数据写出到文件中，续写模式
                readLines：指定字符编码，把文件中的数据，读到集合中
                readUtf8Lines：按照utf-8的形式，把文件中的数据，读到集合中

                copy：拷贝文件或者文件夹
     */
    public static void main(String[] args) throws IOException {
        // 根据参数创建一个file对象
        File file1 = FileUtil.file("C:\\", "Users", "Naruto", "Desktop", "createFile.md");
        System.out.println(file1);

        // 根据参数创建文件
        FileUtil.touch(file1);

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("bbb");
        list.add("bbb");
        // 把集合中的数据写出到文件中，覆盖模式
//        FileUtil.writeLines(list, file1, "utf-8");

//        FileUtil.appendLines(list, file1, "utf-8");

//        List<String> result = FileUtil.readLines(file1, "utf-8");
        List<String> result = FileUtil.readUtf8Lines(file1);
        System.out.println(result);

        File file2 = new File("C:\\Users\\Naruto\\Desktop\\www.txt");
        // 拷贝文件
        FileUtil.copy(file1, file2, true);

    }
}
