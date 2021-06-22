/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： PayCypher.java
 * 模块说明：
 * 修改历史：
 * 2021年06月23日 - XX - 创建。
 */
package
        refactor.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XX
 * @since 1.0
 */
public class PayCypher implements IPayMode {
    private Logger logger = LoggerFactory.getLogger(PayCypher.class);

    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }
}
