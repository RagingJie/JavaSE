package Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author
 * @Date 2024/9/24 9:30
 * @Description:
 */
public class Test12151 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0);
        System.out.println(bigDecimal);

        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.03).multiply(bigDecimal).setScale(2, RoundingMode.FLOOR);
        System.out.println(bigDecimal1);
    }
}
