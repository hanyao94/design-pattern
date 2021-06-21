/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： POPOrderDeliveredService.java
 * 模块说明：
 * 修改历史：
 * 2021年06月21日 - XX - 创建。
 */
package
        messy;

import base.mq.POPOrderDelivered;
import com.alibaba.fastjson.JSON;

/**
 * @author XX
 * @since 1.0
 */
public class POPOrderDeliveredService {
    public void onMessage(String message){

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }
}
