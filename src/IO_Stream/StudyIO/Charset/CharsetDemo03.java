package IO_Stream.StudyIO.Charset;

import java.io.IOException;
import java.util.Arrays;

/**
 * @Author
 * @Date 2024/7/3 0:11
 * @Description:
 */
public class CharsetDemo03 {

    /**
     * - java中的编码方法
     * <p>
     * | String类中的方法                              | 说明                 |
     * | --------------------------------------------- | -------------------- |
     * | public  byte[]  getBytes()                    | 使用默认方式进行编码 |
     * | public  byte[]  getBytes(String  charsetName) | 使用指定方式进行编码 |
     * <p>
     * - java中的解码方法
     * <p>
     * | String类中的方法                             | 说明                 |
     * | -------------------------------------------- | -------------------- |
     * | String(byte[]  bytes)                        | 使用默认方式进行解码 |
     * | St
     */


    public static void main(String[] args) throws IOException {

        String val = "ai顺应当代发展！";

        // 编码
        // 默认编码方式
        byte[] bytes1 = val.getBytes();
        System.out.println(Arrays.toString(bytes1));

        // 指定方式编码
        byte[] bytes2 = val.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));


        // 解码
        // 默认方式解码
        String str1 = new String(bytes1);
        System.out.println(str1); // ai顺应当代发展！

        // 指定当时解码
        String str2 = new String(bytes1, "GBK");
        System.out.println(str2);  // ai椤哄簲褰撲唬鍙戝睍锛

        String str3 = new String(bytes2, "GBK");
        System.out.println(str3); //  ai顺应当代发展！


    }
}
