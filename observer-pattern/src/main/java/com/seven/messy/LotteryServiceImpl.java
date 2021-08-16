/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： LotteryServiceImpl.java
 * 模块说明：
 * 修改历史：
 * 2021年08月15日 - XX - 创建。
 */
package
        com.seven.messy;

import com.seven.base.LotteryResult;
import com.seven.base.LotteryService;
import com.seven.base.MinibusTargetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class LotteryServiceImpl implements LotteryService {
    private Logger logger = LoggerFactory.getLogger(LotteryServiceImpl.class);

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    public LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 发短信
        logger.info("给⽤户 {} 发送短信通知(短信)：{}", uId, lottery);
        // 发MQ消息
        logger.info("记录⽤户 {} 摇号结果(MQ)：{}", uId, lottery);
        // 结果
        return new LotteryResult(uId,lottery,new Date());
    }
}
