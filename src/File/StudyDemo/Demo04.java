package File.StudyDemo;

import java.io.File;

/**
 * @Author
 * @Date 2024/6/28 1:01
 * @Description:
 */
public class Demo04 {

    public static void main(String[] args) {

        /*
            public  boolean  delete()               删除文件、空文件夹

            细节：
                如果删除的是文件，则直接删除，不走回收站
                如果删除的是空文件夹，则直接删除，不走回收站
                如果删除的是有内容的文件夹，则删除失败
         */


        // 删除文件
        File file1 = new File("C:\\Users\\Naruto\\Desktop\\aa.txt");
        boolean delete = file1.delete();
        System.out.println("file1删除结果：" + delete);

        // 文件夹不为空
        File file2 = new File("C:\\Users\\Naruto\\Desktop\\bb");
        boolean delete2 = file2.delete();
        System.out.println("file2删除结果：" + delete2);

        // 文件夹为空
        File file3 = new File("C:\\Users\\Naruto\\Desktop\\ee");
        boolean delete3 = file3.delete();
        System.out.println("file3删除结果：" + delete3);
    }
}
