/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： SqlSession.java
 * 模块说明：
 * 修改历史：
 * 2021年07月18日 - XX - 创建。
 */
package
        refactor.mediator;

import java.util.List;

/**
 * @author XX
 * @since 1.0
 */
public interface SqlSession {
    <T> T selectOne(String statement);

    <T> T selectOne(String statement,Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement,Object parameter);

    void close();
}
