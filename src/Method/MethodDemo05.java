package Method;

public class MethodDemo05 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 100};

        int[] ints = copyOfRange(arr, 5, 10);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int length = to - from;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            if (from <= to) {
                array[i] = arr[from];
                from++;
            }
        }
        return array;
    }
}
