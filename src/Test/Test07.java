package Test;

//计算0.1+0.2+0.3+0.4+0.5.......
public class Test07 {
    public static void main(String[] args) {
        double num = 0;
        double sum = 0;
        for (int i = 0; i <18; i++) {
            num = num + 0.1;
            sum = num + sum;
        }
        System.out.println(sum);
    }
}
