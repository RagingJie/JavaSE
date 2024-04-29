package Http.HttpUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author Naruto
 * @Date 2024/4/29 10:31
 * @Description: 发送http请求工具， 目前主要封装get、post请求
 */
public abstract class HttpRequest {

    public static String executeGet(String url, String params) {

        String result = "";

        String urlName = url + params;

        InputStreamReader inputStreamReader = null;
        BufferedReader in = null;
        try {
            URL requestUrl = new URL(urlName);
            HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");  // application/json; charset=utf-8
            inputStreamReader = new InputStreamReader(connection.getInputStream());

            in = new BufferedReader(inputStreamReader);

            String line;
            while ((line = in.readLine()) != null) {
                result = result + line;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("get查询失败！！！");
        } finally {  // 关闭连接,释放资源
            try {
                in.close();
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;

    }
}
