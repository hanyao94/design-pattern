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
public class SiChuanCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);
    public void doCooking() {
        logger.info("四川厨师，烹饪川菜，中国最有特⾊的菜系，也是⺠间最⼤菜系。");
    }
}
