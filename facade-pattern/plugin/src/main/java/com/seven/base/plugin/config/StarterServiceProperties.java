/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： StarterServiceProperties.java
 * 模块说明：
 * 修改历史：
 * 2021年07月04日 - XX - 创建。
 */
package
        com.seven.base.plugin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author XX
 * @since 1.0
 */
@ConfigurationProperties("seven.door")
public class StarterServiceProperties {
    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
