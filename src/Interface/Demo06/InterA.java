package Interface.Demo06;

/**
 * @Author Naruto
 * @Date 2024/3/4 21:54
 * @Description:
 */
public interface InterA {

    public abstract void method();

    public default void show() {
        System.out.println("InterA接口实现的show方法----- show");
    }

}
