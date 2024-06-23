package File.FirstDemo;

import java.io.File;
import java.io.IOException;

/**
 * @Author Naruto
 * @Date 2024/6/24 0:26
 * @Description: 初始文件类
 */
public class Demo {
    public static void main(String[] args) {
        /*
        public File(String pathname)                把字符串表示的路径编程File对象
        public Flie(String parent, String child)    把父级路径和子级路径进行拼接
        public File(File parent, String child)      把父级路径和子级路径进行拼接

        C:\Users\Naruto\Desktop

        \: 转义字符

        */

        // 1.根据字符串表示的路径，变成File对象
        String str = "C:\\Users\\Naruto\\Desktop\\a.txt";
        File file1 = new File(str);
        try {
            file1.createNewFile();
            String name = file1.getName();
            System.out.println("文件名称：" + name);
            boolean delete = file1.delete();
            System.out.println(delete);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file1："+file1);

        // 2.父级路径：C:\Users\Naruto\Desktop
        //   子级路径：a.txt
        String parent = "C:\\Users\\Naruto\\Desktop";
        String child = "a.txt";
        File file2 = new File(parent, child);
        System.out.println("file2："+file2);

        File file3 = new File(parent + "\\" + child);
        System.out.println("file3："+file3);

        // 3.把一个File表示的路径和String表示路径进行拼接
        File parent2 = new File("C:\\Users\\Naruto\\Desktop");
        String child2 = "a.txt";

        File file4 = new File(parent2, child2);
        System.out.println("file4："+file4);

    }
}
