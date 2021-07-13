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
public class JiangSuCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);
    public void doCooking() {
        logger.info("江苏厨师，烹饪苏菜，宫廷第⼆⼤菜系，古今国宴上最受⼈欢迎的菜 系。");
    }
}
