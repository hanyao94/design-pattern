/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： LevelTwoCeiling.java
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
public class LevelTwoCeiling implements Matter {

    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司自带";
    }

    public String model() {
        return "二级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(850);
    }

    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }

}