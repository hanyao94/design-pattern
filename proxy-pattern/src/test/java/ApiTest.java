/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年07月08日 - XX - 创建。
 */

import com.seven.agent.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XX
 * @since 1.0
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_IUserDao(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        // 通过bean获取IUserDao 实现 ----> MapperFactoryBean
        IUserDao userDao = beanFactory.getBean("userDao",IUserDao.class);
        String res = userDao.queryUserInfo("100001");
        logger.info("测试结果：{}", res);
    }
}
