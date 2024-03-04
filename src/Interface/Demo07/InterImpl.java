package Interface.Demo07;

/**
 * @Author Naruto
 * @Date 2024/3/4 22:18
 * @Description:
 */
public class InterImpl implements InterA {

    @Override
    public void method() {
        System.out.println("InterImpl实现了method()");
    }

    public static void show(){
        System.out.println("InterImpl中的静态方法......");
    }
}
