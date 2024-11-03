package Reflect.Exersice.Demo01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @Author
 * @Date 2024/11/4 0:06
 * @Description:
 */
public class App {

    // 对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去

    public static void main(String[] args) throws IOException, IllegalAccessException {

        Student stu = new Student("张三", 28, 180.5, "男");
        Teacher teacher = new Teacher("王老五", 35);

        saveObject(teacher);
    }

    /**
     * @param obj 要保存的对象
     * @return void
     * @author Naruto
     * @date 2024/11/4 0:08
     * @description 保存对象的属性值到a.txt文件中去
     */
    public static void saveObject(Object obj) throws IOException, IllegalAccessException {
        // 获取文件
        File file = new File("src/Reflect/Exersice/Demo01/a.txt");
        // 文件输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        // 获取对象class字节码
        Class<?> clazz = obj.getClass();
        // 获取对象属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            // 属性名
            String name = field.getName();
            // 属性值
            Object value = field.get(obj);
            System.out.println(name + "=" + value);
            // 写出
            bw.write(name + "=" + value);
            // 换行
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        bw.close();
    }
}
