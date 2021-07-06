/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ActivityController.java
 * 模块说明：
 * 修改历史：
 * 2021年07月07日 - XX - 创建。
 */
package
        refactor;

import base.Activity;
import base.Stock;
import refactor.util.RedisUtils;

/**
 * @author XX
 * @since 1.0
 */
public class ActivityController {
    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
