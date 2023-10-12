package Extends.Demo02;

import java.util.Scanner;

/**
 * 内存分析工具：在终端打开
 *      jps 查看运行类的id
 *      jhsdb hsdb 打开jdk提供的内存分析工具
 */
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();

        //将对象的地址值zi以16进制的形式打在控制台
//        System.out.println(Long.toHexString(VM.current().addressOf(zi)));
        System.out.println(Long.toHexString(zi.hashCode()));

        //因为内存分析工具需要程序不停止
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}
