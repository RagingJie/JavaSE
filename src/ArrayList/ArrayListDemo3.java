package ArrayList;

import java.util.ArrayList;

/**
 * 需求:
 *      定义一个集合，添加字符串，并进行遍历遍历格式
 *      参照:[元素1,元素2,元素3]
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("acc");
        list.add("ddd");
        list.add("asss");

        System.out.println(list);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i!=list.size()-1){
                System.out.print(s);
                System.out.print(", ");
            }else {
                System.out.print(s);
            }

        }

        System.out.println("]");
    }
}
