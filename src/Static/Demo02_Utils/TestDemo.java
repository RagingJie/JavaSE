package Static.Demo02_Utils;

public class TestDemo {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 4, 7, 5, 151};
        System.out.println("ints数组的内容为："+ArrayUtil.printArr(ints));

        double[] doubles = new double[]{1, 10, 5, 2, 1, 4, 2, 3, 4, 5, 1};
        System.out.println("doubles数组的平均值为：" + ArrayUtil.getAvrage(doubles));
    }
}
