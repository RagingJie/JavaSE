package Utils;

import java.text.SimpleDateFormat;

/**
 * @Author Naruto
 * @Date 2024/6/20 9:59
 * @Description:
 */
public abstract class CommonUtil {

    /**
     * @param time 时间戳（毫秒值）
     * @return java.lang.String
     * @author Naruto
     * @date 2024/6/28 15:09
     * @description 将【时间戳】转换为【yyyy年MM月dd日 HH:mm:ss】时间格式
     */
    public static String dateFormat(Object time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return simpleDateFormat.format(time);
    }

}
