package Reflect.StudyReflect.Demo02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author
 * @Date 2024/11/3 21:51
 * @Description:
 */
public class MyReflectDemo {

    /*
      class类中用于获取构造方法的方法
        constructor<?>[] getconstructors()
        Constructor<?>[] getDeclaredconstructors()
        Constructor<T> getConstructor(class<?>... parameterTypes)
        Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)


        Constructor类中用于创建对象的方法
        T newInstance(object. . . initargs)
        setAccessible( boolean flag)
    */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取class
        Class clazz = Class.forName("Reflect.StudyReflect.Demo02.Student");

        System.out.println("\n========================================================================================\n");

        // 获取构造方法
        // getconstructors
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\n========================================================================================\n");

        // getDeclaredconstructors
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        System.out.println("\n========================================================================================\n");

        // getConstructor，只能获取公共的构造方法
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);

        System.out.println("\n========================================================================================\n");

        // getDeclaredConstructor, 可以获取类中的所用构造方法
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);

        System.out.println("\n========================================================================================\n");

        Constructor declaredConstructorTwo = clazz.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructorTwo);

        System.out.println("\n========================================================================================\n");

        Constructor con = clazz.getDeclaredConstructor(int.class);
        System.out.println("构造方法：" + con);

        // 获取注解
        Annotation[] annotations = con.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("构造方法上使用的注解：" + annotation);
        }

        // 获取修饰符, 2标识私有的，1标识公共的....  修饰符都是用数字标识的
        int modifiers = con.getModifiers();
        System.out.println("修饰符：" + modifiers);

        // setAccessible,暴力反射：表示临时取消权限校验
        con.setAccessible(true);
        Student stu = (Student) con.newInstance(1);  // class Reflect.StudyReflect.Demo02.MyReflectDemo cannot access a member of class Reflect.StudyReflect.Demo02.Student with modifiers "private"
        // 因为是私有的构造方法，不能直接构建对象
        System.out.println(stu);
    }

}
