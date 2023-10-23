package Extends.Demo06;

public class Test {
    public static void main(String[] args) {

        System.out.println("父类狗的行为：==========");
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
        dog.see();


        System.out.println("哈士奇的行为：==========");
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.see();
        husky.tearDownTheHouse();

        System.out.println("沙皮狗的行为：==========");
        SharPei sharPei = new SharPei();
        sharPei.eat();
        sharPei.drink();
        sharPei.see();

        System.out.println("中华田园犬的行为：==========");
        ChineseRuralDog chineseRuralDog = new ChineseRuralDog();
        chineseRuralDog.eat();
        chineseRuralDog.drink();
        chineseRuralDog.see();


    }
}
