/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： EGMCacheAdapter.java
 * 模块说明：
 * 修改历史：
 * 2021年06月11日 - XX - 创建。
 */
package
        refactor.adapter.impl;

import base.EGM;
import refactor.adapter.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author XX
 * @since 1.0
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
