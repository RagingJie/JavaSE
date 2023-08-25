package String;

public class StringDemo7 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        String s = toPrint(arr);
        System.out.println(s);

    }

    public static String toPrint(int[] arr){
        if (arr == null){
            return " ";
        }

        if (arr.length == 0){
            return "[]";
        }

        String result = "[";
        for (int i = 0; i < arr.length-1; i++) {
            result = result+arr[i]+",";
        }
        result = result+arr[arr.length-1] + "]";

        return result;
    }
}
