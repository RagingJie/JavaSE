package Http.Demo01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author
 * @Date 2024/4/21 13:58
 * @Description: http发送get请求练习
 */
public class SendGetHttpDemo01 {

    private final static String VENDING_MACHINE_GOODS_URL = "http://127.0.0.1:9123/androidmachine/goods/list/";

    public static void main(String[] args) {
        String vendingMachineGoods = getVendingMachineGoods();
        System.out.println("获取到的商品信息：" + vendingMachineGoods);
    }

    public static String sendGet(String url, String param) {

        // 返回结果
        String result = "";

        BufferedReader in = null;

        try {
            // 拼接url
            String urlName = url + param;
            // 根据url获取URL对象
            URL requestUrl = new URL(urlName);
            // requestUrl.openConnection() 用于打开到指定URL的通信链接。
            // 强转为具体的类型，如 HttpURLConnection 类型，用于设置请求方法（GET、POST等）、请求头、读取响应状态码等。
            HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
            // 设置 GET 请求方法
            urlConnection.setRequestMethod("GET");
            // 设置请求属性， 默认的属性  application/json; charset=utf-8
            urlConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");

            InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
            in = new BufferedReader(inputStreamReader);

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

            inputStreamReader.close();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return result;

    }

    public static String getVendingMachineGoods() {
        String mId = "8CFCA023F0A7888";
        return sendGet(VENDING_MACHINE_GOODS_URL, mId);
    }
}
