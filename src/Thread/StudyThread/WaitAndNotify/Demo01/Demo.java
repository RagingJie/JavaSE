package Thread.StudyThread.WaitAndNotify.Demo01;

/**
 * @Author
 * @Date 2024/7/31 23:46
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        cook.setName("厨师");
        foodie.setName("吃货");

        cook.start();
        foodie.start();
    }
}
