/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： RedisUtils.java
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
public class RedisUtils {
    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);
    private Map<String,String> dataMap = new ConcurrentHashMap<String, String>();

    public String get(String key) {
        logger.info("Redis获取数据 key：{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("Redis写入数据 key：{} val：{}", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Redis写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        logger.info("Redis删除数据 key：{}", key);
        dataMap.remove(key);
    }

}
