package Interface.Demo09_Adapter;

/**
 * @Author Naruto
 * @Date 2024/3/4 22:58
 * @Description:
 */
public class InterImpl extends InterAdapter {

    @Override
    public void show5() {
        System.out.println("重写Inter中的show5()方法");
    }
}
