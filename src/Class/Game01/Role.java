package Class.Game01;

import java.util.Random;

public class Role {
    private String name;
    private int bloodVolume;

    public Role() {
    }

    public Role(String name, int bloodVolume) {
        this.name = name;
        this.bloodVolume = bloodVolume;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return bloodVolume
     */
    public int getBloodVolume() {
        return bloodVolume;
    }

    /**
     * 设置
     *
     * @param bloodVolume
     */
    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    public void attack(Role role) {
        //计算造成的血量 1~20
        Random random = new Random();
        int hurt = random.nextInt(20) + 1;
        //被攻击者的剩余血量
        int remainBlood = role.getBloodVolume() - hurt;
        //剩余为负数时，默认给值为 0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBloodVolume(remainBlood);
        //this表示方法的调用者
        System.out.println(this.name + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩下了" + remainBlood + "点血");
    }

    public String toString() {
        return "role{name = " + name + ", bloodVolume = " + bloodVolume + "}";
    }
}
