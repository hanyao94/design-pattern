/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： MQEventListener.java
 * 模块说明：
 * 修改历史：
 * 2021年08月15日 - XX - 创建。
 */
package
        com.seven.refactor.event.listener;

import com.seven.base.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XX
 * @since 1.0
 */
public class MQEventListener implements EventListener {
    private Logger logger =
            LoggerFactory.getLogger(MQEventListener.class);

    public void doEvent(LotteryResult result) {
        logger.info("记录⽤户 {} 摇号结果(MQ)：{}", result.getuId(),
                result.getMsg());
    }
}
