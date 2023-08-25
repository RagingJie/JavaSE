package ExecutionFlow;

/**
 * 循环结构：while
 *  语法：
 *      初始化语句;
 *      while(条件判断语句){
 *          循环体语句;
 *          条件控制语句;
 *      }
 *
 */
public class OrderDemo04_While {
    public static void main(String[] args) {
        //需求：利用while循环打印：1~100
        int i = 1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
    }
}


