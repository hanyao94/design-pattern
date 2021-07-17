/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Iterator.java
 * 模块说明：
 * 修改历史：
 * 2021年07月14日 - XX - 创建。
 */
package
        refactor.lang;

/**
 * @author XX
 * @since 1.0
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();
}
