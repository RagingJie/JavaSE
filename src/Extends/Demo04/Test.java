package Extends.Demo04;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.print();
    }
}

class Fu{
    String name = "Fu_show";
}

class Zi extends Fu{
    String name = "Zi_show";
        public void print(){
            String name = "QAAAAAAAAAAAA";
            System.out.println(name);  //就近原则
            System.out.println(this.name);  //指向当前类的变量
            System.out.println(super.name);  //只能使用一个super
        }
}
