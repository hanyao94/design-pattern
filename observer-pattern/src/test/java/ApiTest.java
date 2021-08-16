/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年08月15日 - XX - 创建。
 */

import com.alibaba.fastjson.JSON;
import com.seven.base.LotteryResult;
import com.seven.base.LotteryService;
import com.seven.messy.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XX
 * @since 1.0
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test(){
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.doDraw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));

    }

    @Test
    public void test2(){
        LotteryService lotteryService = new com.seven.refactor.LotteryServiceImpl();
        LotteryResult result = lotteryService.doDraw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }
}
