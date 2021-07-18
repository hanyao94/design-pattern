/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： SqlSessionFactory.java
 * 模块说明：
 * 修改历史：
 * 2021年07月18日 - XX - 创建。
 */
package
        refactor.mediator;

/**
 * @author XX
 * @since 1.0
 */
public interface SqlSessionFactory {
    SqlSession openSession();
}
