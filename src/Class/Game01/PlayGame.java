package Class.Game01;

public class PlayGame {
    public static void main(String[] args) {
        //创建第一个角色
        Role role1 = new Role("乔峰", 100);
        //创建第二个角色
        Role role2 = new Role("鸠摩智", 100);

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
    }
}
