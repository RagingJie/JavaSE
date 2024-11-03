package Reflect.Exersice.Proxy;

import java.lang.reflect.Proxy;

/**
 * @Author
 * @Date 2024/11/4 1:13
 * @Description:
 */
public class ProxyUtil {

    /*

    java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法:

    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h)
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
        参数三：用来指定生成的代理对象要干什么事情

     */

    public static Object createProxy(Object object) {
        Object o = Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),   // 用于指定用哪个类加载器，去加载生成的代理类
                new Class[]{Star.class},  // 指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
                (obj, method, args) -> {   // 用来指定生成的代理对象要干什么事情
                    // 做代理处理操作
                    if (method.getName().equals("sing")) {
                        System.out.println("准备话筒，收钱");
                    } else if (method.getName().equals("dance")) {
                        System.out.println("准备舞台，收钱");
                    }
                    // 运行方法，反射中的运行方法invoke
                    return method.invoke(object, args);
                }
        );
        // 返回代理对象
        return o;
    }
}
