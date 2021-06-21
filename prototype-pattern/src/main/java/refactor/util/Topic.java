/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Topic.java
 * 模块说明：
 * 修改历史：
 * 2021年06月20日 - XX - 创建。
 */
package
        refactor.util;

import java.util.Map;

/**
 * @author XX
 * @since 1.0
 */
public class Topic {
    private Map<String,String> options;
    private String key;

    public Topic() {
    }

    public Topic(Map<String, String> options, String key) {
        this.options = options;
        this.key = key;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
