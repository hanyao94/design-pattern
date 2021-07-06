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
        messy;

import base.Activity;
import base.Stock;

import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class ActivityController {
    public Activity queryActivityInfo(Long id) {
        // 模拟从实际业务应⽤从接⼝中获取活动信息
        Activity activity = new Activity();
        activity.setId(10001L);
        activity.setName("图书嗨乐");
        activity.setDesc("图书优惠券分享激励分享活动第⼆期");
        activity.setStartTime(new Date());
        activity.setStopTime(new Date());
        activity.setStock(new Stock(1000,1));
        return activity;
    }
}
