package ArrayList;


import java.util.ArrayList;

/**
 * 需求:
 * 1，main方法中定义一个集合，存入三个用户对象。
 *      用户属性为:id，username，password
 * 2.要求:定义一个方法，根据id查找对应的用户信息。
 *      如果存在，返回索引
 *      如果不存在，返回-1
 */
public class ArrayListDemo9 {
    public static void main(String[] args) {
        //创建User对象
        User u1 = new User(1, "admin01", "123456");
        User u2 = new User(2, "admin02", "123456");
        User u3 = new User(3, "admin03", "123456");

        //创建集合
        ArrayList<User> list = new ArrayList<>();
        //添加对象
        list.add(u1);
        list.add(u2);
        list.add(u3);
        int check = check(1, list);
        System.out.println(check);
    }

    public static int check(int id, ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            int ids = list.get(i).getId();
            if (ids==id) return i;
        }
        return -1;
    }
}
