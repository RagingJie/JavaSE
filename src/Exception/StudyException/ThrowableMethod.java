package Exception.StudyException;

/**
 * @Author
 * @Date 2024/9/9 15:34
 * @Description:
 */
public class ThrowableMethod {

    /*
            | 方法名称                        | 说明                              |
            | public  String  getMessage()    | 返回此 throwable 的详细信息字符串 |
            | public  String  toString()      | 返回此可抛出的简短描述            |
            | public  void  printStackTrace() | 把异常的错误信息输出在控制台      |

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);

            String s = e.toString();
            System.out.println(s);

            e.printStackTrace();
        }

        System.out.println("看看我执行了吗？");

        // 在控制台打印红色字体
        System.err.println(12155);
    }
}
