package Exception.StudyException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.prefs.BackingStoreException;

/**
 * @Author
 * @Date 2024/9/9 14:47
 * @Description:
 */
public class Demo04 {
    /*
            自己处理异常
                灵魂二问：如果try中可能会遇到多个问题，怎么执行？
                           会写多个catch与之对应
                           注意：
                                如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面

                           了解性：
                                在JDK7之后，我们可以在catch中同时捕获多个异常，中间用 | 进行隔开
                                表示如果出现了A异常或B异常的话，采取同一种处理方案
    */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            // 可能出现异常的代码;
            System.out.println(arr[5]);
            System.out.println(2 / 0);
            String s = null;
            System.out.println(s.equals("null"));
            File file = new File("");
            new FileOutputStream(file);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
            System.out.println("索引越界了");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (NullPointerException | IOException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("看看我执行了嘛？");
    }
}
