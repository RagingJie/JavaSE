package Exception.StudyException;

/**
 * @Author
 * @Date 2024/9/9 14:47
 * @Description:
 */
public class Demo03 {
    /*
            自己处理异常
                灵魂一问：如果try中没有遇到问题，怎么执行？
                           会把try里面所有的代码全部执行完毕，不会执行catch里面的代码
                           注意：
                                只有当出现了异常才会执行catch里面的代码
    */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            // 可能出现异常的代码;
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了嘛？");
    }
}
