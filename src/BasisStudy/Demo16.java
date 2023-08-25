package BasisStudy;

/**
 * 赋值运算符
 */
public class Demo16 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 将+=两边的书进行相加运算，然后赋值给左边的变量a
        a += b;
        //等同于：a = (int)( a + b );
        System.out.println(a);//30
        System.out.println(b);//20

        //a=30
        a %= b; //a➗b的余数赋值给a
        System.out.println(a);//10


        //细节：
        //+=，-=，/=，%= 底层都隐藏了一个强制类型转换
        short i = 1;
        //把左边与右边相加，得到结果2，在赋值给左边的变量
        i += 1;
        //等同于：i = (short)( i + 1 );
        System.out.println(i);//2

    }
}
