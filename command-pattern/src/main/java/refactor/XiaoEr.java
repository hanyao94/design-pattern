/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： XiaoEr.java
 * 模块说明：
 * 修改历史：
 * 2021年07月14日 - XX - 创建。
 */
package
        refactor;

import base.CommandExecutor;
import base.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XX
 * @since 1.0
 */
public class XiaoEr {
    private Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private List<CommandExecutor> commandExecutors = new ArrayList<CommandExecutor>();

    public  void order(ICook cook){
        commandExecutors.add(new CookingCommandExecutorImpl(cook));
    }

    public void placeOrder(){
        for (CommandExecutor commandExecutor : commandExecutors) {
            commandExecutor.execute();
        }
        commandExecutors.clear();
    }
}
