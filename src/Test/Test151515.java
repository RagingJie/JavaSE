package Test;

import Extends.Demo07.Student;

import java.math.BigDecimal;

public class Test151515 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);

        BigDecimal bigDecimal = new BigDecimal(18);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(18);
        System.out.println(bigDecimal1.compareTo(bigDecimal));
    }
}
