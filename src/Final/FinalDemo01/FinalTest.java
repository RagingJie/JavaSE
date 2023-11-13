package Final.FinalDemo01;

/**
 * @Author
 * @Date 2023/11/8 10:19
 * @Description:
 */
public class FinalTest {
    public static void main(String[] args) {
       /*
        fina1修饰方法：表明该方法是最终方法，不能被重写
        fina1修饰类：表明该类是最终类，不能被继承
        final修饰变量：叫做常量，只能被赋值一次
        */

        final int a = 10;  //被final修饰的变量会变成常量，无法再被修改值
        System.out.println(a);
//        a = 20;

    }
}

class Fu{
    public final void eat(){  //final修饰的方法，子类不能重写
        System.out.println("吃饭~~");
    }
}

class Zi extends Fu{
/*
    @Override
    public void eat(){
        System.out.println("儿子吃饭~~");
    }*/
}

