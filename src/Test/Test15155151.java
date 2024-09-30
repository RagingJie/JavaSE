package Test;

import cn.hutool.core.text.csv.CsvUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author
 * @Date 2024/9/16 20:46
 * @Description:
 */
public class Test15155151 {

    static String appCode = "malemaje";
    static String appSecret = "sm0OFDGdSNql1WK1WJyKNehZXkktbxFe";
    static String getTokenUrl = "http://192.168.0.121:9217/api/anon/auth/validateForPay";

    public static void main(String[] args) {
        String token = getToken();
        String url = "http://192.168.0.121:9217/api/merchant/findDivisionStrategyByReceiverGroupId";
        HttpResponse execute = HttpRequest.post(url)
                .header("Content-type", "application/json; charset=utf-8")
                .header("Accept", "application/json")
                .header("iToken", token)
                .body("100045")
                .execute();

//        HttpResponse execute1 = HttpUtil.createGet(url)
//                .header("Content-type", "application/json; charset=utf-8")
//                .header("Accept", "application/json")
//                .header("iToken", token)
//                .execute();
        System.out.println(execute);

    }


    public static String getToken() {
        Map<String, String> params = new HashMap<>();
        params.put("ia", appCode);
        params.put("ip", appSecret);
        params.put("type", "openapi");
        HttpResponse execute = HttpRequest.post(getTokenUrl)
                .body(JSONObject.toJSONString(params))
                .execute();
        String body = execute.body();
        String token = JSONObject.parseObject(body).getJSONObject("data").getString("iToken");
        System.out.println("token=>" + token);
        return token;
    }
}
