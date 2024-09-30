package Test;

import java.math.BigDecimal;

/**
 * @Author
 * @Date 2024/9/20 14:17
 * @Description:
 */
public class Test00001111 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(85.261).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal);
    }
}
