/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： MapperFactoryBean.java
 * 模块说明：
 * 修改历史：
 * 2021年07月07日 - XX - 创建。
 */
package
        com.seven.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author XX
 * @since 1.0
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {
    private Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    public T getObject() throws Exception {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Select select = method.getAnnotation(Select.class);
                logger.info("SQL: {}", select.value().replace("#{uId}", args[0].toString()));
                return args[0] + "xxxxxxxxx";
            }
        };
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    public Class<?> getObjectType() {
        return mapperInterface;
    }

    public boolean isSingleton() {
        return true;
    }
}
