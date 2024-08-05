package Network.Demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author
 * @Date 2024/8/5 9:49
 * @Description:
 */
public class InetAddressDemo {
    /*
            static InetAddress getByName(String host)     确定主机名称的ip地址。主机名称可以是机器名称，也可以是IP地址
            String getHostName()                          获取此ip地址的主机名
            String getHostAddress()                       返回文本显示中的ip地址字符串
    */
    public static void main(String[] args) throws UnknownHostException {

        // 获取InetAddress对象
        // ip的对象  一台电脑的对象
        InetAddress address = InetAddress.getByName("Naruto");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println("主机名：" + hostName);

        String ip = address.getHostAddress();
        System.out.println("主机ip地址：" + ip);

    }
}
