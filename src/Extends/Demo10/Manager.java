package Extends.Demo10;

public class Manager extends Staff {
    double manageBonuses;

    public double getManageBonuses() {
        return manageBonuses;
    }

    public void setManageBonuses(double manageBonuses) {
        this.manageBonuses = manageBonuses;
    }

    public Manager() {
    }

    public Manager(String id, String name, double salary, double manageBonuses) {
        super(id, name, salary);
        this.manageBonuses = manageBonuses;
    }

    @Override
    public void work(){
        System.out.println("经理正在管理其他人~~~");
    }

    @Override
    public void eat(){
        System.out.println("经理正在吃米饭~~~");
    }

}
