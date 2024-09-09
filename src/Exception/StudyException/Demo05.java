package Exception.StudyException;

/**
 * @Author
 * @Date 2024/9/9 14:47
 * @Description:
 */
public class Demo05 {
    /*
            自己处理异常
              灵魂三问：
                如果try中遇到的问题没有被捕获，怎么执行？
                相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理
    */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            // 可能出现异常的代码;
            System.out.println(arr[10]);
        } catch (NullPointerException e) {
            // 如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了嘛？");
    }
}
