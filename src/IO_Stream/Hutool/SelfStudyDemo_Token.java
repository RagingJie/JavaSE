package IO_Stream.Hutool;

import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTHeader;
import cn.hutool.jwt.JWTUtil;

import java.util.HashMap;

/**
 * @Author
 * @Date 2024/7/24 15:51
 * @Description: 练习token
 */
public class SelfStudyDemo_Token {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid", 123);
        map.put("expireTime", System.currentTimeMillis() + 1000 * 60); // 1分钟秒过期时间

        String token = JWTUtil.createToken(map, "userToken".getBytes());
        System.out.println(token);

        final JWT jwt = JWTUtil.parseToken(token);
        JWTHeader header = jwt.getHeader();
        System.out.println("header：" + header);
        Object sub = jwt.getPayload("sub");
        System.out.println("sub：" + sub);

        boolean isTrue = JWTUtil.verify(token, "userToken".getBytes());
        System.out.println("token是否验证通过：" + isTrue);

    }
}
