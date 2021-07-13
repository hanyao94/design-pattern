/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： GuangDongCook.java
 * 模块说明：
 * 修改历史：
 * 2021年07月14日 - XX - 创建。
 */
package
        refactor.impl;

import base.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XX
 * @since 1.0
 */
public class ShanDongCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);
    public void doCooking() {
        logger.info("⼭东厨师，烹饪鲁菜，宫廷最⼤菜系，以孔府⻛味为⻰头");
    }
}
