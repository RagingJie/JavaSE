package Test;

public class Person1 {

    String name;

    public Person1() {
    }

    static {
        String name = "default";
        System.out.println(name);
    }

    public static void main(String[] args) {

        /**
         * 在创建对象时，
         * 静态代码块就运行了
         */
        Person1 person1 = new Person1();
    }

}
