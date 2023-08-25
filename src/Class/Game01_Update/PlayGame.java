package Class.Game01_Update;

public class PlayGame {
    public static void main(String[] args) {

        //创建第一个角色
        Role role1 = new Role("乔峰", 100,'男');
        //创建第二个角色
        Role role2 = new Role("鸠摩智", 100,'男');
        System.out.println();
        //展示角色信息
        role1.showRoleInfo();
        System.out.println("=======================");
        role2.showRoleInfo();
        System.out.println();
        System.out.println("********************************************************");
        //开始格斗 -- 回合制游戏
        while (true) {
            role1.attack(role2);
            if (role2.getBloodVolume() == 0) {
                System.out.println(role1.getName() + "K.O了" + role2.getName());
                break;
            }
            role2.attack(role1);
            if (role1.getBloodVolume() == 0) {
                System.out.println(role2.getName() + "K.O了" + role1.getName());
                break;
            }
        }

        System.out.println("********************************************************");

        //展示角色信息
        role1.showRoleInfo();
        System.out.println("=======================");
        role2.showRoleInfo();
    }
}
