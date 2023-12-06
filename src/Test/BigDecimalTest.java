package Test;

import java.math.BigDecimal;

/**
 * @Author Naruto
 * @Date 2023/12/6 14:10
 * @Description:
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        /**
         * @param args
         * @return void
         * @author Naruto
         * @date 2023/12/6 14:12
         * @description compareTo() 比较大小
         *              前者大则返回1 后者大返回-1 两者相等返回0
         */
        BigDecimal allOfAvailableFbUse = BigDecimal.valueOf(500);
        BigDecimal canDeductedMoney = BigDecimal.valueOf(1000);
        int i = allOfAvailableFbUse.compareTo(canDeductedMoney);
        System.out.println(i);
    }
}
