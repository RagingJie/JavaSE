package Interface.Demo06;

/**
 * @Author Naruto
 * @Date 2024/3/4 21:56
 * @Description:
 */
public class InterImpl implements InterA, InterB{

    @Override
    public void method() {
        System.out.println("实现类中重写method()方法");
    }

    @Override
    public void show() {
        System.out.println("实现类中重写show方法");
    }

}
