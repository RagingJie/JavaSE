package Extends.Demo10;

public class Test {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setId("1");
        staff.setName("张三");
        staff.setSalary(12.20);
        staff.work();
        staff.eat();
        System.out.println(staff.toString());

        System.out.println();
        System.out.println("*******************************");
        System.out.println();

        Manager manager = new Manager();
        manager.setId("2");
        manager.setName("王五");
        manager.setSalary(12.1);
        manager.setManageBonuses(15.5);
        manager.work();
        manager.eat();
        System.out.println(manager.toString());

        System.out.println();
        System.out.println("*******************************");
        System.out.println();

        Cook cook = new Cook();
        cook.setId("3");
        cook.setName("李四");
        cook.setSalary(158.2);
        cook.eat();
        cook.work();
        System.out.println(cook.toString());
    }
}
