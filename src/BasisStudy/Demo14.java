package BasisStudy;

/**
 * 自增  自减
 */
public class Demo14 {
    public static void main(String[] args) {
        // ++  --  自增  自减
        int a = 10;
        // 先用再加 1
        a++;
        System.out.println(a); //11
        //先加 1 再用
        ++a;
        System.out.println(a);  //12
        //先用再减 1
        a--;
        System.out.println(a);  //11
        //先减 1 再用
        --a;
        System.out.println(a);  //10
    }
}
