package File.StudyDemo;

import java.io.File;
import java.io.IOException;

/**
 * @Author
 * @Date 2024/6/28 0:28
 * @Description:
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {

        /**
         public  boolean  createNewFile()        创建一个新的空的文件
         public  boolean  mkdir()                创建单级文件夹
         public  boolean  mkdirs()               创建多级文件夹
         public  boolean  delete()               删除文件、空文件夹
         */

        // 1.createNewFile()  创建一个新的空的文件
        // 细节1：
        //      如果路径表示的文件是不存在的，则创建成功，方法返回true
        //      如果路径表示的文件是存在的，则创建失败，方法返回false
        // 细节2：
        //      如果父级路径是不存在的，那么方法会有异常 IOException
        // 细节3：
        //      createNewFile()方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀名的文件
        File file1 = new File("C:\\Users\\Naruto\\Desktop\\logo.png");
        boolean one = file1.createNewFile();
        System.out.println("file1是否创建文件成功：" + one);

//        File file2 = new File("C:\\Users\\Naruto\\Desktop\\aa\\logo.png");
//        boolean two = file2.createNewFile();
//        System.out.println("file2是否创建文件成功：" + two);

        File file3 = new File("C:\\Users\\Naruto\\Desktop\\aa");
        boolean three = file3.createNewFile();
        System.out.println("file3是否创建文件成功：" + three);

        // 2. mkdir() make directory 文件夹（目录）
        // 细节1：windows当中路径是唯一的，如果当前路径已经存在，则创建失败， 返回false
        // 细节2：mkdir方法只能创建单级文件夹，无法创建多级文件夹
        File file4 = new File("C:\\Users\\Naruto\\Desktop\\aa");
        boolean four = file4.mkdir();
        System.out.println("file4创建文件夹是否成功：" + four);

        File file5 = new File("C:\\Users\\Naruto\\Desktop\\bb");
        boolean five = file5.mkdir();
        System.out.println("file5创建文件夹是否成功：" + five);

        File file6 = new File("C:\\Users\\Naruto\\Desktop\\aa\\bb\\cc");
        boolean six = file6.mkdir();
        System.out.println("file6创建文件夹是否成功：" + six);

        // 3. mkdir()  创建多级文件夹
        // 细节：既可以创建单级的，又可以创建多级的文件夹
        File file7 = new File("C:\\Users\\Naruto\\Desktop\\aa\\bb\\cc");
        boolean seven = file7.mkdirs();
        System.out.println("file7创建文件夹是否成功：" + seven);

        File file8 = new File("C:\\Users\\Naruto\\Desktop\\bb\\cc\\dd");
        boolean eight = file8.mkdirs();
        System.out.println("file8创建文件夹是否成功：" + eight);

        File file9 = new File("C:\\Users\\Naruto\\Desktop\\ee");
        boolean nine = file9.mkdirs();
        System.out.println("file9创建文件夹是否成功：" + nine);
    }
}
