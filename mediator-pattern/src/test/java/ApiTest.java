/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年07月31日 - XX - 创建。
 */

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import refactor.mediator.Resources;
import refactor.mediator.SqlSession;
import refactor.mediator.SqlSessionFactory;
import refactor.mediator.SqlSessionFactoryBuilder;
import refactor.po.User;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author XX
 * @since 1.0
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_queryUserInfoById() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            try {
                User user = session.selectOne("refactor.dao.IUserDao.queryUserInfoById", 1L);
                logger.info("测试结果：{}", JSON.toJSONString(user));
            } finally {
                session.close();
                reader.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_queryUserList() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User req = new User();
                req.setAge(18);
                List<User> userList = session.selectList("refactor.dao.IUserDao.queryUserList", req);
                logger.info("测试结果：{}", JSON.toJSONString(userList));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
