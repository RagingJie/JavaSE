package ExecutionFlow;

/**
 * 循环结构：do...while
 *  语法：
 *      初始化语句;
 *      do{
 *          循环体语句;
 *          条件控制语句;
 *      } while(条件判断语句);
 *
 */
public class OrderDemo04_Do_While {
    public static void main(String[] args) {
        int a = 10;
        do{
            a = a-3;
        } while (a>0);
        System.out.println("a最后的值为："+a);
    }
}
