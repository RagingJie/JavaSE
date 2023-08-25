package ExecutionFlow;

public class OrderDemo04_For_Test01 {
    public static void main(String[] args) {
        //打印  1~5
        System.out.println("打印  1~5");
        for (int i =1; i<=5; i++){
            System.out.print(i+" ");
        }
        //打印  5~1
        System.out.println("");
        System.out.println("打印  5~1");
        for (int i =5; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
