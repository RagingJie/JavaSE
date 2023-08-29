package ConsolidationExercise;

/*  给定两个字符串，A和B。
    A的旋转操作就是将A
    最左边的字符移动到最右边。
    例如，若A =abcde'，在移动一次之后结果就是'bcdea如果在若干次调整操作之后，A能变成B，
    那么返回True。如果不能匹配成功，则返回false
*/
public class Demo13Case1 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "eabcda";
        boolean check = check(A, B);
        System.out.println(check);
    }

    //检查A是否可以变成B
    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB))
                return true;
        }
        return false;
    }


    //拆分拼接的方法
    //旋转字符串，将左端字母移到右端
    public static String rotate(String str) {
//        StringBuilder sb = new StringBuilder();
//        char x = str.charAt(0);
//        String substring = str.substring(1);
//        return sb.append(substring).append(x).toString();


        //简化代码
        char end = str.charAt(0);
        String s = str.substring(1);
        return s + end;
    }
}
