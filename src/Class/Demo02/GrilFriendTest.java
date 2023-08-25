package Class.Demo02;

public class GrilFriendTest {
    public static void main(String[] args) {
        GrilFriend grilFriend = new GrilFriend();
       /* grilFriend.age = 18;
        grilFriend.height = 170;
        grilFriend.name = "小美";
        grilFriend.sex = "女";*/

        //设置属性
        grilFriend.setName("小美");
        grilFriend.setSex("女");
        grilFriend.setHeight(170);
        grilFriend.setAge(19);

        //获取值
        System.out.println(grilFriend.getName());
        System.out.println(grilFriend.getAge());
        System.out.println(grilFriend.getSex());
        System.out.println(grilFriend.getHeight());


        String s = grilFriend.toString();
        System.out.println(s);

        grilFriend.eat();
        grilFriend.playGame();
        grilFriend.sleep();
    }
}
