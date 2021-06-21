/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： POPOrderAdapterServiceImpl.java
 * 模块说明：
 * 修改历史：
 * 2021年06月21日 - XX - 创建。
 */
package
        refactor.impl;

import base.service.POPOrderService;
import refactor.OrderAdapterService;

/**
 * @author XX
 * @since 1.0
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    public boolean isFirst(String uid) {
        return popOrderService.isFirstOrder(uid);
    }
}
