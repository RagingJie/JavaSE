package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author
 * @Date 2024/9/16 14:17
 * @Description:
 */
public class Test00011 {
    public static void main(String[] args) {

        String date = "Tue Jun 18 2024 14:16:14 GMT+0800 (中国标准时间)";
        Date date1 = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date1);
        System.out.println(format);
    }
}
