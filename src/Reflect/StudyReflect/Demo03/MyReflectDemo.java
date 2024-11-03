package Reflect.StudyReflect.Demo03;

import java.lang.reflect.Field;

/**
 * @Author
 * @Date 2024/11/3 22:46
 * @Description:
 */
public class MyReflectDemo {

    /*

    class类中用于获取成员变量的方法
        Field[] getFields()                     返回所有公共成员变量对象的数组
        Field[] getDeclaredFields()             返回所有成员变量对象的数组
        Field getField(string name)             返回单个公共成员变量对象
        Field getDeclaredField(string name)     返回单个成员变量对象


    Field类中用于创建对象的方法
        void set(object obj, object value)      赋值
        object get(object obj)                  获取值

    */


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        // 获取class字节码文件的对象
        Class<Student> clazz = Student.class;

        System.out.println("\n========================================================================================\n");

        // 获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Student的成员变量：" + field);
        }

        System.out.println("\n========================================================================================\n");

        // 获取单个成员变量
        Field name = clazz.getDeclaredField("name");
        System.out.println("单个成员变量：" + name);

        System.out.println("\n========================================================================================\n");

        // 获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println("获取权限修饰符：" + (modifiers == 2 ? "private" : "未知"));

        System.out.println("\n========================================================================================\n");

        // 获取成员变量的名字
        String n = name.getName();
        System.out.println("成员变量的名字：" + n);

        System.out.println("\n========================================================================================\n");

        // 获取成员变量的数据类型
        Class<?> type = name.getType();
        System.out.println("成员变量的数据类型：" + type);

        System.out.println("\n========================================================================================\n");

        // 获取成员变量记录的值
        Student stu = new Student("张三", 18, 186.5);
        // 暴力反射
        name.setAccessible(true);
        String value = (String) name.get(stu);
        System.out.println("name变量的值：" + value);

        System.out.println("\n========================================================================================\n");

        // 设置变量的值
        name.set(stu,"老王");
        System.out.println(stu);
    }
}
