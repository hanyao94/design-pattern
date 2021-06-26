/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： EngineController.java
 * 模块说明：
 * 修改历史：
 * 2021年06月26日 - XX - 创建。
 */
package
        messy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XX
 * @since 1.0
 */
public class EngineController {
    private Logger logger = LoggerFactory.getLogger(EngineController.class);

    public String process(String userId, String userSex, int userAge) {
        logger.info("ifelse实现方式判断用户结果。userId：{} userSex：{} userAge：{}", userId, userSex, userAge);
        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "果实A";
            }
            if (userAge > 25) {
                return "果实B";
            }
        }

        if ("woman".equals(userSex)) {
            if (userAge > 25) {
                return "果实C";
            }

            if (userAge < 25) {
                return "果实C";
            }
        }

        return null;
    }
}