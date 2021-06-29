/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： SsoInterceptor.java
 * 模块说明：
 * 修改历史：
 * 2021年06月29日 - XX - 创建。
 */
package
        base;

/**
 * @author XX
 * @since 1.0
 */
public class SsoInterceptor implements HandlerInterceptor {
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        return ticket.equals("success");
    }
}
