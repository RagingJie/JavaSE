package Stream.FirstDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Naruto
 * @Date 2024/6/19 17:50
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三一");
        list1.add("李四");
        list1.add("李兄");
        list1.add("李八");
        list1.add("王五");
        list1.add("王八");
        list1.add("刘能");
        list1.add("刘秘书");
        list1.add("刘书记");
        list1.add("张珲二");
        list1.add("张长");

        // 将list1 中姓张的 添加到list2中
        ArrayList<String> list2 = new ArrayList<>();

        // 迭代器遍历，无需担心索引越界问题
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.startsWith("张")) {
                list2.add(next);
            }
        }

        // 使用forEach结合lambda实现集合遍历
        System.out.println("list2：");
        list2.forEach(item -> {
            System.out.println(item);
        });

        // 将姓 张的 长度为三的元素放入list3中
        ArrayList<String> list3 = new ArrayList<>();

        // 增强for循环，遍历集合
        for (String data : list2) {
            if (data.length() == 3) {
                list3.add(data);
            }
        }

        // 使用for循环，遍历集合
        System.out.println("list3：");
        for (int i = list3.size() - 1; i >= 0; i--) {
            System.out.println(list3.get(i));
        }


        System.out.println("**********************************");
        System.out.println("第二种方式：stream流");
        list1.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));


    }
}
