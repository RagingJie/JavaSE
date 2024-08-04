package Thread.StudyThreadPool.CustomThreadPool;

/**
 * @Author
 * @Date 2024/8/4 23:53
 * @Description:
 */
public class GetTheNumberOfProcessors {
    public static void main(String[] args) {
        // 获取java在虚拟机中可用处理器数，即：电脑cpu可用线程数
        int num = Runtime.getRuntime().availableProcessors();
        System.out.println("获取java在虚拟机中可用处理器数：" + num);
    }
}
