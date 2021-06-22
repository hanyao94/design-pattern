/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Pay.java
 * 模块说明：
 * 修改历史：
 * 2021年06月23日 - XX - 创建。
 */
package
        refactor.channel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import refactor.mode.IPayMode;

import java.math.BigDecimal;

/**
 * @author XX
 * @since 1.0
 */
public abstract class Pay {
    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
