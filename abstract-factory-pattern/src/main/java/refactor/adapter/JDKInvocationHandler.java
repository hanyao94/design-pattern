/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： JDKInvocationHandler.java
 * 模块说明：
 * 修改历史：
 * 2021年06月11日 - XX - 创建。
 */
package
        refactor.adapter;

import refactor.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author XX
 * @since 1.0
 */
public class JDKInvocationHandler implements InvocationHandler {
    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter,args);
    }
}
