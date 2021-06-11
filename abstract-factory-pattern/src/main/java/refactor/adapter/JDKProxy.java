/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： JDKProxy.java
 * 模块说明：
 * 修改历史：
 * 2021年06月12日 - XX - 创建。
 */
package
        refactor.adapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author XX
 * @since 1.0
 */
public class JDKProxy {
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }
}
