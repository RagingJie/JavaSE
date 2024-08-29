package Generics.StudyGenerics.GenericsMethod;

import java.util.ArrayList;

/**
 * @Author
 * @Date 2024/8/30 0:12
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "张三", "李四", "王五");
        System.out.println(list1);


        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2, 1,2,3,4,4,5,6);
        System.out.println(list2);
    }
}
