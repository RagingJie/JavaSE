package Test;

/**
 * @Author
 * @Date 2024/9/27 16:17
 * @Description:
 */
public class Test15155651 {
    public static void main(String[] args) {
        String code = "UC-0000000001104";
        String substring = code.substring(3);
        System.out.println(substring);

        Long aLong = Long.valueOf(substring);
        System.out.println(aLong);
    }
}
