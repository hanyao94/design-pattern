/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： EGM.java
 * 模块说明：
 * 修改历史：
 * 2021年06月11日 - XX - 创建。
 */
package
        base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author XX
 * @since 1.0
 */
public class EGM {
    private Logger logger = LoggerFactory.getLogger(EGM.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<String, String>();

    public String gain(String key) {
        logger.info("EGM获取数据 key：{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("EGM写入数据 key：{} val：{}", key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("EGM写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void delete(String key) {
        logger.info("EGM删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
