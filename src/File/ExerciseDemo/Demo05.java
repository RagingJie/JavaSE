package File.ExerciseDemo;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author
 * @Date 2024/7/1 1:38
 * @Description:
 */
public class Demo05 {

    // 需求：统计一个文件夹中每种文件的个数并打印（考虑子文件夹）。
    // 打印格式如下：
    //  txt：3个
    //  java：4个
    //  png：2个

    // 存放文件类型与个数
    static Map<String, Integer> map = new HashMap();

    public static void main(String[] args) {

        File file = new File("src\\File\\ExerciseModule");

        getFileNumber(file);

        // 遍历迭代器map
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + "：" + next.getValue() + "个");
        }

    }

    /**
     * @param src 文件夹路径
     * @return void
     * @author Naruto
     * @date 2024/7/1 1:48
     * @description 获取文件夹中每一种文件的个数
     */
    public static void getFileNumber(File src) {
        File[] files = src.listFiles();
        if (files.length != 0 && files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // 文件处理
                    String name = file.getName();
                    String[] split = name.split("\\.");
                    String key = split[split.length - 1];
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key) + 1);
                    } else {
                        map.put(key, 1);
                    }

                } else {
                    // 文件夹处理
                    getFileNumber(file);
                }
            }
        }
    }
}
