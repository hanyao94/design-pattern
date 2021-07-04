/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： StarterService.java
 * 模块说明：
 * 修改历史：
 * 2021年07月04日 - XX - 创建。
 */
package
        com.seven.base.plugin.config;

/**
 * @author XX
 * @since 1.0
 */
public class StarterService {
    private String userStr;
    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return this.userStr.split(separatorChar);
    }
}
