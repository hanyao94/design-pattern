/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： EventManager.java
 * 模块说明：
 * 修改历史：
 * 2021年08月15日 - XX - 创建。
 */
package
        com.seven.refactor.event;

import com.seven.base.LotteryResult;
import com.seven.refactor.event.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XX
 * @since 1.0
 */
public class EventManager {

    Map<Enum<EventType>, List<EventListener>> listeners  = new HashMap<Enum<EventType>, List<EventListener>>();

    public EventManager(Enum<EventType> ...operations) {
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation,new ArrayList<EventListener>());
        }
    }

    public void subscribe(Enum<EventType> eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(Enum<EventType> eventType,EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(Enum<EventType> eventType, LotteryResult result){
        List<EventListener> users = listeners.get(eventType);
        for (EventListener user : users) {
            user.doEvent(result);
        }
    }

    public enum  EventType {
        MQ,Message
    }
}
