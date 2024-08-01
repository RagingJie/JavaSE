package Test;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author
 * @Date 2024/8/1 10:22
 * @Description: 获取微信小程序token
 */
public class Test11 {
    public static void main(String[] args) {
        String appId = "appid";
        String appSecret = "appSecret";
        final String getWeChatMiniProgramTokenUrl = "https://api.weixin.qq.com/cgi-bin/token";
        String requestUrl = getWeChatMiniProgramTokenUrl + "?grant_type=client_credential&appid=" + appId + "&secret=" + appSecret;
        System.out.println(requestUrl);

        String result = HttpUtil.get(requestUrl);
        JSONObject json = JSON.parseObject(result);
        String token = json.getString("access_token");

        System.out.println(token);
    }
}
