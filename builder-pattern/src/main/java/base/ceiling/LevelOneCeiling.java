/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： LevelOneCeiling.java
 * 模块说明：
 * 修改历史：
 * 2021年06月16日 - XX - 创建。
 */
package
        base.ceiling;

import base.Matter;

import java.math.BigDecimal;

/**
 * @author XX
 * @since 1.0
 */
public class LevelOneCeiling implements Matter {
    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司自带";
    }

    public String model() {
        return "一级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(260);
    }

    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }

}
