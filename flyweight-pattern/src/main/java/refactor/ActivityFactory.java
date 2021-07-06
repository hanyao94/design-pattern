/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ActivityFactory.java
 * 模块说明：
 * 修改历史：
 * 2021年07月07日 - XX - 创建。
 */
package
        refactor;

import base.Activity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author XX
 * @since 1.0
 */
public class ActivityFactory {
    static Map<Long, Activity> activityMap = new HashMap<Long, Activity>();

    public static Activity getActivity(Long id) {
        Activity activity = activityMap.get(id);
        if (null == activity) {
            // 模拟从实际业务应用从接口中获取活动信息
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("图书嗨乐");
            activity.setDesc("图书优惠券分享激励分享活动第二期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }
}
