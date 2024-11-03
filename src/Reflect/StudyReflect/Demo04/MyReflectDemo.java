package Reflect.StudyReflect.Demo04;

import Utils.SeparatorUtil.SeparatorUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @Author
 * @Date 2024/11/3 22:46
 * @Description:
 */
public class MyReflectDemo {

    /*

     */


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        // 获取class字节码文件的对象
        Class<Student> clazz = Student.class;

        SeparatorUtil.getSeparator();

        // 获取里面所有的方法对象（包含父类种所有的公共方法）
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("公共的方法（包含父类种所有的公共方法）：" + method);
        }

        SeparatorUtil.getSeparator();

        // 获取对象里面所有的方法对象（不包含父类种所有的公共方法）
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("对象里面所有的方法对象（不包含父类种所有的公共方法）：" + declaredMethod);
        }

        SeparatorUtil.getSeparator();

        // 获取指定单一的方法
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        System.out.println("指定单一的方法：" + setName);

        SeparatorUtil.getSeparator();

        // 获取方法修饰符
        int modifiers = setName.getModifiers();
        System.out.println("方法修饰符：" + modifiers);

        SeparatorUtil.getSeparator();

        // 获取方法的名字
        String name = setName.getName();
        System.out.println("方法的名字：" + name);

        SeparatorUtil.getSeparator();

        // 获取方法的形参
        Parameter[] parameters = setName.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println("方法的形参：" + parameter);
        }

        SeparatorUtil.getSeparator();

        // 获取方法抛出的异常
        Class<?>[] exceptionTypes = setName.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println("方法抛出的异常：" + exceptionType);
        }

        SeparatorUtil.getSeparator();

        // 方法运行
        // method类中用于创建对象的方法
        // Object invoke(Object obj, Object... args): 运行方法
        // 参数一：用obj对象调用方法
        // 参数二：调用方法的传递参数（如果没有就不写）
        // 返回值：方法的返回值（如果没有就不写）
        Student stu = new Student();
        // 因为是private的，所以要加暴力反射
        setName.setAccessible(true);
        // 运行方法，有返回值就获取返回值
        String returnParam = (String) setName.invoke(stu, "张三");
        System.out.println("返回值：" + returnParam);


    }
}
