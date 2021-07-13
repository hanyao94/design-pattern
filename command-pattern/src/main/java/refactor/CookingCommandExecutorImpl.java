/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： CommandExecutorImpl.java
 * 模块说明：
 * 修改历史：
 * 2021年07月13日 - XX - 创建。
 */
package
        refactor;

import base.CommandExecutor;
import base.ICook;

/**
 * @author XX
 * @since 1.0
 */
public class CookingCommandExecutorImpl implements CommandExecutor {
    private ICook iCook;

    public CookingCommandExecutorImpl(ICook iCook) {
        this.iCook = iCook;
    }

    public void execute() {
        iCook.doCooking();
    }
}
