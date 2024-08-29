package Generics.StudyGenerics.GenericsClass;

/**
 * @Author
 * @Date 2024/8/29 23:55
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.add("你好啊");
        list1.add("我很好啊");
        list1.add("你最近怎么样啊");
        list1.add("挺好的");

        System.out.println(list1.size);
        System.out.println(list1.toString());
        System.out.println(list1.get(2));
    }
}
