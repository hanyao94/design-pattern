/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： LiBangCoat.java
 * 模块说明：
 * 修改历史：
 * 2021年06月16日 - XX - 创建。
 */
package
        base.coat;

import base.Matter;

import java.math.BigDecimal;

/**
 * @author XX
 * @since 1.0
 */
public class LiBangCoat implements Matter {

    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "立邦";
    }

    public String model() {
        return "默认级别";
    }

    public BigDecimal price() {
        return new BigDecimal(650);
    }

    public String desc() {
        return "立邦始终以开发绿色产品、注重高科技、高品质为目标，以技术力量不断推进科研和开发，满足消费者需求。";
    }

}