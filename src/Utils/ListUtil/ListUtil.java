package Utils.ListUtil;

import java.util.*;

/**
 * @Author
 * @Date 2024/10/8 14:26
 * @Description: 集合工具类
 */
public abstract class ListUtil {

    /**
     * @param listA 集合
     * @param listX 可变参数的其他集合
     * @return 集合A与集合B的交集元素（相同元素）的集合
     * @author Naruto
     * @date 2024/10/8 13:54
     * @description 获取多个集合中都有的元素集合
     */
    public static <T> List<T> intersectionOfSets(List<T> listA, List<T>... listX) {

        if (listA == null || listA.isEmpty() || listX == null || listX.length == 0) {
            return Collections.emptyList();
        }

        // 将第一个列表转换为Set以提高查找效率
        Set<T> setA = new HashSet<>(listA);

        // 如果有多个集合，计算所有集合的交集
        for (List<T> list : listX) {
            if (list == null || list.isEmpty()) {
                return Collections.emptyList(); // 如果任何一个集合为空，则直接返回空集合
            }
            // 使用流和filter操作来找出交集
            setA.retainAll(new HashSet<>(list));
        }

        // 返回交集结果
        return new ArrayList<>(setA);
    }
}
