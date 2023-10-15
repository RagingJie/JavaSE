package Extends.Demo03;

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
        }
}
