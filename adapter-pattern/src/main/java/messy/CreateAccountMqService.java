/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： CreateAccountMqService.java
 * 模块说明：
 * 修改历史：
 * 2021年06月21日 - XX - 创建。
 */
package
        messy;

import base.mq.CreateAccount;
import com.alibaba.fastjson.JSON;

/**
 * @author XX
 * @since 1.0
 */
public class CreateAccountMqService {
    public void onMessage(String message) {

        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }
}
