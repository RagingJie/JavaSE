package String;

/**
 * 屏蔽敏感词
 */
public class StringDemo13 {
    public static void main(String[] args) {
        String talk = "你玩的真他妈的菜啊，以后他妈的别玩了，你个废物~，CNM";

        String[] minGan = {"他妈的","废物","TMD","CNM"};

//        boolean b = talk.equalsIgnoreCase("你玩的真他妈的菜啊，以后他妈的别玩了，你个废物~，cNm");
//        System.out.println(b);

        for (int i = 0; i < minGan.length; i++) {
            talk = talk.replace(minGan[i], "***");
        }

        System.out.println(talk);


    }
}
