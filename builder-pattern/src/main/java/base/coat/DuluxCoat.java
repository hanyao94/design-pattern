/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： DuluxCoat.java
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
public class DuluxCoat implements Matter {

    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "多乐士(Dulux)";
    }

    public String model() {
        return "第二代";
    }

    public BigDecimal price() {
        return new BigDecimal(719);
    }

    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }

}