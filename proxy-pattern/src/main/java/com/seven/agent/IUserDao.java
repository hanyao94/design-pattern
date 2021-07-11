package com.seven.agent; /**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： com.seven.design.agent.IUserDao.java
 * 模块说明：
 * 修改历史：
 * 2021年07月08日 - XX - 创建。
 */

/**
 * @author XX
 * @since 1.0
 */
public interface IUserDao {
    @Select("select userName from user where id =#{uId}")
    String queryUserInfo(String uId);
}
