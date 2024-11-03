package Reflect.Exersice.Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author
 * @Date 2024/11/4 0:26
 * @Description:
 */
public class App {

    // 反射可以跟配置文件结合的方式，动态的创建对象，并调用方法

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        // 1.获取配置文件
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/Reflect/Exersice/Demo02/prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        // 获取全类名和方法名
        String className = (String) prop.get("classname");
        String methodName = (String) prop.get("method");
        System.out.println("类名=> " + className);
        System.out.println("方法名=> " + methodName);

        // 获取类字节码文件
        Class<?> clazz = Class.forName(className);
        // 创建对象第一种方式
        Object o = clazz.newInstance();
        System.out.println("直接通过newInstance创建：" + o);
        // 创建对象第二种方式，无参构造
        Constructor<?> con = clazz.getDeclaredConstructor();
        // 未知是否为public，直接暴力反射
        con.setAccessible(true);
        Object obj = con.newInstance();
        System.out.println("通过构造方法创建：" + obj);

        // 运行方法
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(obj);
    }
}
