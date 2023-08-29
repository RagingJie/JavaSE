package ArrayList;

import java.util.ArrayList;

/**
 * 集合里面能存引用数据类型
 * 不能存储基本数据类型，要想存储基本数据类型，需要基本数据类型变为包装类，进行存储
 * 包装类：
 *      byte    Byte
 *      short   Short
 *      char    Character    ***************
 *      int     Integer      **************
 *      long    Long
 *      float   Float
 *      double  Double
 *      boolean Boolean
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //jdk7以前创建ArrayList：  ArrayList<String> strings = new ArrayList<String>();
        //jdk7以后创建：ArrayList<String> strings = new ArrayList<>();

        ArrayList<String> strings = new ArrayList<>();
//        strings.add("1223");
        //打印的时候，打印的是集合里面的内容，而不是地址值
        System.out.println(strings);
    }
}
