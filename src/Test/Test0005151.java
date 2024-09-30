package Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author
 * @Date 2024/9/23 10:29
 * @Description:
 */
public class Test0005151 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println("当前时间=>" + dateFormat.format(calendar.getTime()));

        calendar.add(Calendar.DAY_OF_MONTH, 15);
        System.out.println("未来15的时间为=>" + dateFormat.format(calendar.getTime()));
    }
}
