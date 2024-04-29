package Http.Demo02;

import Http.HttpUtil.HttpRequest;
import Test.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author
 * @Date 2024/4/29 8:48
 * @Description:
 */
public class SendHttpTest001 {

    private final static String BAI_DU_URL = "https://www.baidu.com/";
    private final static String TEST = "http://localhost:8888/testHttp/get";

    public static void main(String[] args) {

        String result1 = sendGet(BAI_DU_URL, "");
        System.out.println("请求百度地址，返回结果：" + result1);

        String result2 = sendGet(TEST, "");
        System.out.println("请求自己测试服务返回结果：" + result2);

        String result3 = HttpRequest.executeGet(TEST, "");
        System.out.println("使用工具类get请求结果：" + result3);

    }

    /**
     * @param url
     * @param params
     * @return java.lang.String
     * @author Naruto
     * @date 2024/4/29 8:53
     * @description
     */
    private static String sendGet(String url, String params) {

        String result = "";
        String urlName = url + params;

        try {
            URL requestUrl = new URL(urlName);
            HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            InputStream inputStream = urlConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader in = new BufferedReader(inputStreamReader);

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

            in.close();
            inputStreamReader.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
