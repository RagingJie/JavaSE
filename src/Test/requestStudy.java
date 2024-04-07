package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author
 * @Date 2024/4/7 16:25
 * @Description:
 */
public class requestStudy {
    public static void main(String[] args) throws Exception {
        String url = "https://www.baidu.com/";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // 设置请求类型
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("Response Code : " + responseCode);

        // 读取响应
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // 打印结果
        System.out.println(response.toString());
    }
}
