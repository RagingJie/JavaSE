package BasisStudy;

/**
 *  + 的运算
 *  字符串位置不同，所执行的结果也不同
 *  在进行 ” + “ 操作时，只要有字符串的存在，进行的就是字符串的拼接操作
 */
public class Demo12 {
    public static void main(String[] args) {
        //字符串位置不同，所执行的结果也不同
        //在进行 ” + “ 操作时，只要有字符串的存在，进行的就是字符串的拼接操作
        System.out.println(1+2+"年小高");
        System.out.println("小高今年:" +  1 + 12 + "岁了");
        System.out.println(1+2+"ac"+2+1 );
    }
}
