package Test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author
 * @Date 2024/8/27 10:41
 * @Description:
 */
public class IfTest {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 12);
        map.put("key2", 23);
        map.put("key3", 45);
        map.put("key4", 67);

        if (map.containsKey("key1")) {
            System.out.println(map.get("key1"));
        } else if (map.containsKey("key2")) {
            System.out.println(map.get("key2"));
        } else if (map.containsKey("key3")) {
            System.out.println(map.get("key3"));
        } else {
            System.out.println(map.get("key4"));
        }

    }
}
