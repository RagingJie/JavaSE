package RegularExpression.Demo;

/**
 * @Author
 * @Date 2024/4/1 10:56
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String yan = "11551a511";

        String role = "^\\d";
        String role1 = "\\d+";
        String role2 = "\\d*";
        String role3 = "\\d{5}\\w{1}\\d{3}";
        String role4 = "[0-9]{1,5}[a-z][0-9]{3}";
        String role5 = "\\w{1,5}a\\d{3}";
        String role6 = "^\\d";
        String role7 = "^\\d?";
        String role8 = "^\\d?";
        String role9 = "^\\d?";
        String role10 = "^\\d?";
        String role11 = "^\\d?";
        String role12 = "^\\d?";
        String role13 = "^\\d?";

        boolean matches1 = yan.matches(role);
        boolean matches2 = yan.matches(role1);
        boolean matches3 = yan.matches(role2);
        boolean matches4 = yan.matches(role3);
        boolean matches5 = yan.matches(role4);
        boolean matches6 = yan.matches(role5);
        boolean matches7 = yan.matches(role6);
        boolean matches8 = yan.matches(role7);
        boolean matches9 = yan.matches(role8);
        boolean matches10 = yan.matches(role9);
        boolean matches11 = yan.matches(role10);
        boolean matches12 = yan.matches(role11);
        boolean matches13 = yan.matches(role12);
        boolean matches14 = yan.matches(role13);

        System.out.println(matches1);
        System.out.println(matches2);
        System.out.println(matches3);
        System.out.println(matches4);
        System.out.println(matches5);
        System.out.println(matches6);
        System.out.println(matches7);
        System.out.println(matches8);
        System.out.println(matches9);
        System.out.println(matches10);
        System.out.println(matches11);
        System.out.println(matches12);
        System.out.println(matches13);
        System.out.println(matches14);

    }
}
