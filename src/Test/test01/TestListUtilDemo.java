package Test.test01;

import Utils.ListUtil.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author
 * @Date 2024/10/8 14:28
 * @Description:
 */
public class TestListUtilDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("151");
        list1.add("1faf");
        list1.add("1sdf1");
        list1.add("dsfs1fds");
        list1.add("ds5165s");
        list1.add("ds523");


        list2.add("ds523");
        list2.add("1fafesff");
        list2.add("1faf");
        list2.add("ds154");
        list2.add("ds5165s");

        List<String> list = ListUtil.intersectionOfSets(list1, list2);
        System.out.println(list);
    }
}
