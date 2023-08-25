package ExecutionFlow;


/**
 * 打印九九乘法表
 */
public class OrderDemo04_For_Test02 {
    public static void main(String[] args) {
        for (int i = 1; i<=9; i++){
           for (int j = 1 ; j <= i; j++){
               System.out.print(j+"*"+i+"="+i*j+" ");
           }
            System.out.println(" ");
        }
    }
}
