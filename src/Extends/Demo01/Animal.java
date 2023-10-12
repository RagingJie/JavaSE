package Extends.Demo01;


/**
 * 权限修饰符:  private
 *  私有:  只能在本类中访问
 *        爸爸的私房钱（自己能用）
 * 注意事项:
 *       子类只能访问父类中非私有的成员
 */
public class Animal {
    public void drink(){
        System.out.println("喝水");
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
