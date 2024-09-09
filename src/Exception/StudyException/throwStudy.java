package Exception.StudyException;

import cn.hutool.core.annotation.AnnotationUtil;

/**
 * @Author
 * @Date 2024/9/9 16:15
 * @Description:
 */
public class throwStudy {

    /*
            throws：写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常
            throw：写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。

            需求：
                定义一个方法求数组的最大值
    */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 4, 515, 262, 5665, 5959, 522, 3, 5, 4, 3, 6, 48, 12, 562};
        int[] arr2 = null;
        int[] arr3 = {};
        int max = 0;
        try {
            max = getMax(arr3);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组为空");
        }
        System.out.println(max);
    }


    private static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException {
        if (arr == null) {
            throw new NullPointerException();
        }

        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = 0;
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
}
