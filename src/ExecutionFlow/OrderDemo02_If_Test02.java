package ExecutionFlow;

import java.util.Scanner;

/*根据不同的分数送不同的礼物。
如果是95~100分，送自行车一辆
如果是90~94分，游乐场玩一天
如果是80~89分，送变形金刚一个
如果是80分，揍一顿。*/
public class OrderDemo02_If_Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数（整数）：");
        int score = scanner.nextInt();
        if (score >= 0 && score <=100){
            if (score >=95 && score<= 100){
                System.out.println("送一辆自行车~");
            }else if (score >=90 && score<= 94){
                System.out.println("游乐场玩一天~");
            }else if (score >=80 && score<= 89){
                System.out.println("送变形金刚一个~");
            }else {
                System.out.println("揍一顿！！！");
            }
        }else {
            System.out.println("输入成绩有误！！！");
        }
        scanner.close();
    }
}
