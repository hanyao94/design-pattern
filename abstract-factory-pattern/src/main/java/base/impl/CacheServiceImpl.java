/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： CacheServiceImpl.java
 * 模块说明：
 * 修改历史：
 * 2021年06月11日 - XX - 创建。
 */
package
        base.impl;

import base.CacheService;
import base.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author XX
 * @since 1.0
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
