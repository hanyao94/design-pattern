/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： OrderService.java
 * 模块说明：
 * 修改历史：
 * 2021年06月21日 - XX - 创建。
 */
package
        base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XX
 * @since 1.0
 */
public class OrderService {
    private Logger logger = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId){
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }

}
