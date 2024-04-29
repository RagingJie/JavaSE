package Http.HttpUtil;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author Naruto
 * @Date 2024/4/29 10:31
 * @Description: 发送http请求工具， 目前主要封装get、post请求
 */
public abstract class HttpRequest {

    /**
     * @param url    请求路径
     * @param params 携带参数
     * @return java.lang.String
     * @author Naruto
     * @date 2024/4/29 14:12
     * @description 发送get请求
     */
    public static String executeGet(String url, String params) {

        String result = "";

        String urlName = url + params;

        try {
            URL requestUrl = new URL(urlName);
            HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");  // application/json; charset=utf-8
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());

            BufferedReader in = new BufferedReader(inputStreamReader);

            String line;
            while ((line = in.readLine()) != null) {
                result = result + line;
            }

            in.close();
            inputStreamReader.close();

        } catch (Exception e) {
//            e.printStackTrace();
            if (e.getMessage().equals("Network is unreachable: connect")) {
                System.out.println("get查询失败！，，，404，请求的《URL》地址不存在！！！");
            } else {
                System.out.println("get查询失败！！！" + e.getMessage());
            }
        }

        return result;

    }

    /**
     * @param url    请求路径
     * @param params 携带参数
     * @return java.lang.String
     * @author Naruto
     * @date 2024/4/29 14:13
     * @description 发送post请求
     */
    public static String executePost(String url, String params) {

        String result = "";
        try {
            URL requestUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");

            connection.setDoOutput(true);   // 允许写出
            connection.setDoOutput(true);   // 允许写入

            OutputStreamWriter outWriter = new OutputStreamWriter(connection.getOutputStream());
            outWriter.write(params);
            outWriter.flush();

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());

            BufferedReader in = new BufferedReader(inputStreamReader);

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

            in.close();
            inputStreamReader.close();
            outWriter.close();

        } catch (Exception e) {
//            e.printStackTrace();
            if (e.getMessage().equals("Network is unreachable: connect")) {
                System.out.println("请求post方法失败！！！,404，请求的《URL》地址不存在！！！");
            } else {
                System.out.println("请求post方法失败！！！");
            }

        }

        return result;
    }
}
