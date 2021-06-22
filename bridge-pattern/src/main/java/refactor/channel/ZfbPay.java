/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ZfbPay.java
 * 模块说明：
 * 修改历史：
 * 2021年06月23日 - XX - 创建。
 */
package
        refactor.channel;

import refactor.mode.IPayMode;

import java.math.BigDecimal;

/**
 * @author XX
 * @since 1.0
 */
public class ZfbPay extends  Pay {
    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟⽀付宝渠道⽀付划账开始。uId：{} tradeId：{} amount： {}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("模拟⽀付宝渠道⽀付⻛控校验。uId：{} tradeId：{} security： {}", uId, tradeId, security);
        if (!security) {
            logger.info("模拟⽀付宝渠道⽀付划账拦截。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("模拟⽀付宝渠道⽀付划账成功。uId：{} tradeId：{} amount： {}", uId, tradeId, amount);
        return "0000";
    }

}
