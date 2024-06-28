package File.StudyDemo;

import java.io.File;

/**
 * @Author
 * @Date 2024/6/28 14:57
 * @Description:
 */
public class Demo07 {

    public static void main(String[] args) {

        System.out.println();
        /*
            public  File[]  listFiles()                            获取当前该路径下全部内容
         */

        // 需求：我现在要获取 ‪C:\Users\Naruto\Desktop\photo 文件夹中的所有jpeg文件

        File file = new File("C:\\Users\\Naruto\\Desktop\\photo");
        File[] files = file.listFiles();
        System.out.print("获取文件夹中的所有jpeg文件（listFiles方法）：");
        for (File item : files) {
            if (item.isFile() && item.getName().endsWith(".jpeg")) {
                System.out.print(item.getName() + ", ");
            }

        }

        System.out.println();

    }
}
