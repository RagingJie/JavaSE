package BasisStudy;

/**
 * 逻辑运算符:  &  |  ^  !   与  或  异或  非
 */
public class Demo19 {
    public static void main(String[] args) {
        System.out.println("-----与------------------------------------------");
        System.out.println(true & true); //true
        System.out.println(false & false); //false
        System.out.println(false & true); //false
        System.out.println(true & false); //false

        System.out.println("-----或------------------------------------------");

        System.out.println(true | true); //true
        System.out.println(false | false); //false
        System.out.println(false | true); //true
        System.out.println(true | false); //true

        System.out.println("-----异或------------------------------------------");

        System.out.println(true ^ true); //false
        System.out.println(false ^ false); //false
        System.out.println(false ^ true); //true
        System.out.println(true ^ false); //true

        System.out.println("-----非 ------------------------------------------");

        System.out.println(!true); //false
        System.out.println(!false); //true


    }
}
