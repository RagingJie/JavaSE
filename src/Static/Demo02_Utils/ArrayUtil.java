package Static.Demo02_Utils;

/**
 * 需求:在实际开发中，经常会遇到一些数组使用的工具类。
 * 请按照如下要求编写一个数组的工具类:ArrayUtil
 * 提供一个工具类方法printArr，用于返回整数数组的内容。
 * 返回的字符串格式如:[10,20,50,34,100](只考虑整数数组，且只考虑一维数组)
 * 提供这样一个工具方法getAvrage，用于返回平均分。(只考虑浮点型数组，且只考虑一维数组)定义一个测试类TestDemo，
 * 调用该工具类的工具方法，并返回结果。
 */
public class ArrayUtil {

    //私有化构造方法
    //目的:为了不让外界创建他的对象
    private ArrayUtil() {
    }

    /**
     * 打印数组中的内容
     *
     * @param arr
     * @return
     */
    public static String printArr(int[] arr) {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = 0; i < arr.length - 1; i++) {
            stringBuffer.append(arr[i]).append(", ");
        }
        stringBuffer.append(arr[arr.length-1]).append("]");
        return stringBuffer.toString();
    }

    /**
     * 计算浮点数组的平均数
     * @param arr
     * @return
     */
    public static double getAvrage(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        double result = sum / arr.length;
        return result;
    }
}
