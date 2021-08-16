/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： LotteryServiceImpl.java
 * 模块说明：
 * 修改历史：
 * 2021年08月16日 - XX - 创建。
 */
package
        com.seven.refactor;

import com.seven.base.LotteryResult;
import com.seven.base.MinibusTargetService;

import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class LotteryServiceImpl extends DefaultLotteryService {
   private MinibusTargetService minibusTargetService = new MinibusTargetService();

    protected LotteryResult draw(String uId) {
        String lottery = minibusTargetService.lottery(uId);
        return new LotteryResult(uId,lottery,new Date());
    }
}
