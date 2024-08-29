package Generics.StudyGenerics.GenericsMethod;

import java.util.ArrayList;

/**
 * @Author
 * @Date 2024/8/30 0:08
 * @Description:
 */
public class ListUtil {
    private ListUtil() {
    }

    public static <E> void addAll(ArrayList<E> list, E e1, E e2, E e3) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }

    // 可变参数 E... e
    public static <E> void addAll(ArrayList<E> list, E... e) {
        for (E element : e) {
            list.add(element);
        }
    }

    public static void show() {
        System.out.println("你是天下第一帅");
    }
}
