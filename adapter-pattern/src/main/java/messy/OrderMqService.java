/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： OrderMqService.java
 * 模块说明：
 * 修改历史：
 * 2021年06月21日 - XX - 创建。
 */
package
        messy;

import base.mq.OrderMq;
import com.alibaba.fastjson.JSON;

/**
 * @author XX
 * @since 1.0
 */
public class OrderMqService {
    public void onMessage(String message){
        OrderMq mq = JSON.parseObject(message,OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }
}
