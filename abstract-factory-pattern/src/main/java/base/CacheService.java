/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： CacheService.java
 * 模块说明：
 * 修改历史：
 * 2021年06月11日 - XX - 创建。
 */
package
        base;

import java.util.concurrent.TimeUnit;

/**
 * @author XX
 * @since 1.0
 */
public interface CacheService {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);


}
