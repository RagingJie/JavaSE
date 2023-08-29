package ArrayList;

import java.util.ArrayList;

/**
 *  boolean add(E e)      添加
 *  boolean remove(E e)E  删除
 *  remove(int index)     删除
 *  E set(int index,E e)  修改
 *  E get(int index)      查
 *  int size()            长度
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {

        //1.创建一个集合
        ArrayList<String> strings = new ArrayList<>();

        //添加元素
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("aaa");
        System.out.println(strings);

        //删除元素
        strings.remove("aaa");  //仅删除第一个元素
        System.out.println(strings);

        boolean aaa = strings.remove("aaa");
        System.out.println(aaa);  //返回true  或者 false

        String remove = strings.remove(1);  //返回删除的元素
        System.out.println(remove);
        System.out.println(strings);

        //修改元素
        String kjadka = strings.set(0, "kjadka");
        System.out.println(kjadka);  //返回被覆盖的元素
        System.out.println(strings);

        //查询
        String s = strings.get(1); //根据索引获取元素
        System.out.println(s);

        //遍历数组
        for (int i = 0; i < strings.size(); i++) {
            String ss = strings.get(i);
            System.out.println(ss);
        }
    }
}
