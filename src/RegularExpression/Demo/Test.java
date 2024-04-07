package RegularExpression.Demo;

/**
 * @Author
 * @Date 2024/4/1 10:56
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String yan = "115515151";

        String role = "^\\d+$";

        boolean matches = yan.matches(role);
        System.out.println(matches);
    }
}
