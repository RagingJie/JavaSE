package Interface.Demo08;

/**
 * @Author Naruto
 * @Date 2024/3/4 22:37
 * @Description:
 */
public interface Inter {

    default void show1() {
        System.out.println("show1方法实现......");
//        System.out.println("这里执行了100行代码~");
        show3();
    }

    default void show2() {
        System.out.println("show2方法实现......");
        show3();
//        System.out.println("这里执行了100行代码~");
    }

    static void show4() {
        System.out.println("show4方法实现......");
        show6();
//        System.out.println("这里执行了100行代码~");
    }

    static void show5() {
        show6();
        show6();
//        System.out.println("show5方法实现......");

    }

    // 普通的私有方法，给默认方法服务的
    private void show3() {
        System.out.println("这里执行了100行代码~");
    }

    // 静态的私有方法，给静态方法服务的
    private static void show6(){
        System.out.println("这里执行了100行代码~");
    }

}
