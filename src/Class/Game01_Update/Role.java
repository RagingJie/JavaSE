package Class.Game01_Update;

import java.util.Random;

public class Role {
    private String name;
    private int bloodVolume;
    private char sex;
    private String face; //长相是随机的

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌柳涂", "面目狰疗"};
    String[] girlfaces = {"美央绝伦", "沉鱼落雁", "婷婷天立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述:
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果 【轰】的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int bloodVolume, char sex) {
        this.name = name;
        this.bloodVolume = bloodVolume;
        this.sex = sex;
        setFace(sex);
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char sex) {
        //长相是随机的
        Random random = new Random();
        if (sex == '男') {
            int index = random.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (sex == '女') {
            int index = random.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰疗";
        }
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
        int index = random.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        System.out.printf(KungFu, this.name, role.getName());
        System.out.println();

        int hurt = random.nextInt(20) + 1;
        //被攻击者的剩余血量
        int remainBlood = role.getBloodVolume() - hurt;
        //剩余为负数时，默认给值为 0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBloodVolume(remainBlood);

        //受伤的描述
        //血量> 99 0索引的描述
        //80~ 90    1索引的描述
        //70~ 80    2索引的描述
        //60~ 70    3索引的描述
        //40~ 60    4索引的描述
        //20~ 40    5索引的描述
        //10~ 20    6索引的描述
        //小于10的   7索引的描述
        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBlood <= 90 && remainBlood > 80) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (remainBlood <= 80 && remainBlood > 70) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (remainBlood <= 70 && remainBlood > 60) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (remainBlood <= 60 && remainBlood > 40) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (remainBlood <= 40 && remainBlood > 20) {
            System.out.printf(injureds_desc[5], role.getName());
        } else if (remainBlood <= 20 && remainBlood > 10) {
            System.out.printf(injureds_desc[6], role.getName());
        } else {
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();
        /*//this表示方法的调用者
        System.out.println(this.name + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩下了" + remainBlood + "点血");*/
    }

    public void showRoleInfo() {
        System.out.println("名称为：" + getName());
        System.out.println("血量为：" + getBloodVolume());
        System.out.println("性别为：" + getSex());
        System.out.println("长相为：" + getFace());
    }
}
