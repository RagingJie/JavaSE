package Extends.Demo01;

/**
 *  现在有四种动物:布偶猫、中国狸花猫、哈士奇、泰迪。暂时不考虑属性，只要考虑行为。
 *  请按照继承的思想特点进行继承体系的设计。
 *      四种动物分别有以下的行为:
 *          布偶猫：吃饭、喝水、抓老鼠
 *          中国狸花猫：吃饭、喝水、抓老鼠
 *          哈士奇：吃饭、喝水、看家、拆家
 *          泰迪：吃饭、喝水、看家、蹭一蹭
 */
public class TestDemo {
    public static void main(String[] args){

        //哈士奇
        System.out.println("哈士奇");
        Husky husky = new Husky();
        husky.chaiJia();
        husky.drink();
        husky.eat();
        husky.seeHome();

        System.out.println("==================================");

        //狸花猫
        System.out.println("狸花猫");
        LiuHua liuHua = new LiuHua();
        liuHua.drink();
        liuHua.eat();
        liuHua.catchMice();

        System.out.println("==================================");

        //布偶猫
        System.out.println("布偶猫");
        Ragdoll ragdoll = new Ragdoll();
        ragdoll.drink();
        ragdoll.eat();
        ragdoll.catchMice();

        System.out.println("==================================");

        //泰迪
        System.out.println("泰迪");
        Teddy teddy = new Teddy();
        teddy.rub();
        teddy.seeHome();
        teddy.drink();
        teddy.eat();

    }
}
