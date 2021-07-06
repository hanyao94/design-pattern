/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： LoginSsoDecorator.java
 * 模块说明：
 * 修改历史：
 * 2021年06月29日 - XX - 创建。
 */
package
        messy;

import base.SsoInterceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author XX
 * @since 1.0
 */
public class LoginSsoDecorator extends SsoInterceptor {
    private static Map<String,String> authMap  = new ConcurrentHashMap<String, String>();

    static {
        authMap.put("huahua","queryUserInfo");
        authMap.put("doudou","queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        boolean success = ticket.equals("success");
        if (!success) return false;
        String userId = request.substring(9);
        String method = authMap.get(userId);
        // 模拟⽅法校验
        return "queryUserInfo".equals(method);
    }
}
