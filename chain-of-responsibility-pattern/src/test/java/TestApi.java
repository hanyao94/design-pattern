/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年07月13日 - XX - 创建。
 */

import base.AuthService;
import com.alibaba.fastjson.JSON;
import messy.AuthController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import refactor.AuthLink;
import refactor.impl.Level1AuthLink;
import refactor.impl.Level2AuthLink;
import refactor.impl.Level3AuthLink;

import java.text.ParseException;
import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class TestApi {

    private Logger logger = LoggerFactory.getLogger(TestApi.class);

    @Test
    public void test_AuthController() throws ParseException {

        AuthController authController = new AuthController();
        // 模拟三级负责⼈审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("⼩ 傅哥", "1000998004813441", new Date())));
                logger.info("测试结果：{}", "模拟三级负责⼈审批，王⼯");
        AuthService.auth("1000013", "1000998004813441");
        // 模拟⼆级负责⼈审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("⼩ 傅哥", "1000998004813441", new Date())));
                logger.info("测试结果：{}", "模拟⼆级负责⼈审批，张经理");
        AuthService.auth("1000012", "1000998004813441");
        // 模拟⼀级负责⼈审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("⼩ 傅哥", "1000998004813441", new Date())));
                logger.info("测试结果：{}", "模拟⼀级负责⼈审批，段总");
        AuthService.auth("1000011", "1000998004813441");
        logger.info("测试结果：{}", "审批完成");
    }


        @Test
        public void test_AuthLink() throws ParseException {
            AuthLink authLink = new Level3AuthLink("1000013", "王工")
                    .appendNext(new Level2AuthLink("1000012", "张经理")
                            .appendNext(new Level1AuthLink("1000011", "段总")));

            logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

            // 模拟三级负责人审批
            AuthService.auth("1000013", "1000998004813441");
            logger.info("测试结果：{}", "模拟三级负责人审批，王工");
            logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

            // 模拟二级负责人审批
            AuthService.auth("1000012", "1000998004813441");
            logger.info("测试结果：{}", "模拟二级负责人审批，张经理");
            logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

            // 模拟一级负责人审批
            AuthService.auth("1000011", "1000998004813441");
            logger.info("测试结果：{}", "模拟一级负责人审批，段总");
            logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

        }


}
