package String;

/**
 * 身份显示
 */
public class StringDemo11 {
    public static void main(String[] args) {
        String id = "235121202011125245";
//        System.out.println(id.length());

        System.out.println("身份证号为："+id);


        String birthday = id.substring(6, 14);
        String gender = id.substring(16, 17);
        int sex = Integer.parseInt(gender);

        String year = birthday.substring(0, 4);
        String month = birthday.substring(4, 6);
        String day = birthday.substring(6);

        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        System.out.println("性别为：" + (sex % 2 == 0 ? "女" : "1男"));
    }
}
