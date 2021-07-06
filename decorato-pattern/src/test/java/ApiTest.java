/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年06月29日 - XX - 创建。
 */

import base.SsoInterceptor;
import messy.LoginSsoDecorator;
import org.junit.Test;

/**
 * @author XX
 * @since 1.0
 */
public class ApiTest {

    @Test
    public void test1() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu",
                "t");
        System.out.println("登录校验：" + request + (success ? " 放⾏" : " 拦截"));
    }

    @Test
    public void test2() {
        refactor.LoginSsoDecorator ssoDecorator = new refactor.LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }
}
