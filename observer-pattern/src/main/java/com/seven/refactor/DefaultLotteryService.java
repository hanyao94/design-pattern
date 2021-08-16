/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： DefaultLotteryService.java
 * 模块说明：
 * 修改历史：
 * 2021年08月16日 - XX - 创建。
 */
package
        com.seven.refactor;

import com.seven.base.LotteryResult;
import com.seven.base.LotteryService;
import com.seven.refactor.event.EventManager;
import com.seven.refactor.event.listener.MQEventListener;

/**
 * @author XX
 * @since 1.0
 */
public abstract class DefaultLotteryService implements LotteryService {
    private EventManager eventManager;

    public DefaultLotteryService() {
        this.eventManager = new EventManager(EventManager.EventType.MQ,EventManager.EventType.Message);
        this.eventManager.subscribe(EventManager.EventType.MQ,new MQEventListener());
        this.eventManager.subscribe(EventManager.EventType.Message,new MQEventListener());
    }

    public LotteryResult doDraw(String uId) {
        LotteryResult result = draw(uId);
        eventManager.notify(EventManager.EventType.MQ,result);
        eventManager.notify(EventManager.EventType.Message,result);
        return result;
    }

    protected abstract LotteryResult draw(String uId);
}
