package Thread.ExerciseDemo.Demo05;

/**
 * @Author
 * @Date 2024/8/2 11:23
 * @Description:
 */
public class App {

    /*
            抢红包也用多了多线程
            假设：100块，分成了三个包，现在有五个人去抢
            其中，红包是共享数据
            5个人是五条线程
            打印结果如下：
                XXX抢到了XXX元
                XXX抢到了XXX元
                XXX抢到了XXX元
                XXX没抢到
                XXX没抢到
    */
    public static void main(String[] args) {

        GrabRedEnvelopes g1 = new GrabRedEnvelopes();
        GrabRedEnvelopes g2 = new GrabRedEnvelopes();
        GrabRedEnvelopes g3 = new GrabRedEnvelopes();
        GrabRedEnvelopes g4 = new GrabRedEnvelopes();
        GrabRedEnvelopes g5 = new GrabRedEnvelopes();

        g1.setName("张大");
        g2.setName("老二");
        g3.setName("张三");
        g4.setName("李四");
        g5.setName("王五");

        g1.start();
        g2.start();
        g3.start();
        g4.start();
        g5.start();
    }
}
