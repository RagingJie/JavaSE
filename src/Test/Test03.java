package Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Test03 {
    public static void zhaun(){
        Integer i = 1515111;
        String a = i.toString(i);
        System.out.println(a);
    }

    public static void main(String[] args) {
        zhaun();
        Inter();
        System.out.println("当前系统时间为：");
        String time = time();
        char[] split = time.toCharArray();
        split[4] = '年';
        split[7] = '月';
        split[10] = '日';
        char[] b = new char[20];
        for (int i = 19; i >= 12; i--){
            b[i] = split[i-1];
        }
        b[11] = ' ';
        for (int i = 0; i <= 10; i++){
            b[i] = split[i];
        }
        System.out.println(b);
    }

    public static void Inter(){
        String a = "151511";
        int v = Integer.valueOf(a);
        System.out.println(v);
    }

    public static String time(){
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(df.format(day));
        return df.format(day);
    }


}
