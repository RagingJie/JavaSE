package Exception.StudyException;

/**
 * @Author
 * @Date 2024/9/9 14:47
 * @Description:
 */
public class Demo06 {
    /*
            自己处理异常
              灵魂三问：
                如果try中遇到了问题，那么try下面的其他代码还会执行吗？
                下面的代码就不会执行了，直接跳转到对应的catch当中，执行catch里面的语句体
                但是如果没有对应catch与之匹配，那么还是会交给虚拟机进行处理
    */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            // 可能出现异常的代码;
            System.out.println(arr[10]);
            System.out.println("看看我执行了嘛？try下面的代码");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了嘛？....其他代码");
    }
}
