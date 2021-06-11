/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： IIRCacheAdapter.java
 * 模块说明：
 * 修改历史：
 * 2021年06月11日 - XX - 创建。
 */
package
        refactor.adapter.impl;

import base.IIR;
import refactor.adapter.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author XX
 * @since 1.0
 */
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    public String get(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }
}
