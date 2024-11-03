package Reflect.Exersice.Proxy;

import Utils.SeparatorUtil.SeparatorUtil;

/**
 * @Author
 * @Date 2024/11/4 1:23
 * @Description:
 */
public class App {

    /*

    需求：
        外面的人想要大明星唱一首歌
        1、获取代理的对象
            代理对象 = ProxyUtil.createProxy(大明星的对象)
        2、再调用代理的唱歌方法
            代理对象.唱歌的方法("只因你太美")

     */

    public static void main(String[] args) {

        SeparatorUtil.getSeparator();

        // 获取代理的对象
        BigStar bigStar = new BigStar("鸡哥");
        Star star = (Star) ProxyUtil.createProxy(bigStar);

        // 唱歌
        String result = star.sing("只因你太美");
        System.out.println(result);

        SeparatorUtil.getSeparator();

        // 跳舞
        star.dance();

        SeparatorUtil.getSeparator();
    }
}
