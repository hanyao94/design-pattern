/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： I.java
 * 模块说明：
 * 修改历史：
 * 2021年06月16日 - XX - 创建。
 */
package
        refactor;

import base.Matter;

/**
 * @author XX
 * @since 1.0
 */
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶
    IMenu appendCoat(Matter matter); // 涂料
    IMenu appendFloor(Matter matter); // 地板
    IMenu appendTile(Matter matter); // 地
    String getDetail(); // 明细
}
