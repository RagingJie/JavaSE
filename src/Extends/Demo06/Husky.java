package Extends.Demo06;


//哈士奇
public class Husky extends Dog {
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }

    public void tearDownTheHouse(){
        System.out.println("拆家~~~");
    }
}
