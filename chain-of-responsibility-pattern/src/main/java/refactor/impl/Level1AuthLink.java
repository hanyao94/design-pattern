/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Level1AuthLink.java
 * 模块说明：
 * 修改历史：
 * 2021年07月13日 - XX - 创建。
 */
package
        refactor.impl;

import base.AuthInfo;
import base.AuthService;
import refactor.AuthLink;

import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class Level1AuthLink extends AuthLink {


    public Level1AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待一级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null==next){
            return new AuthInfo("0000", "单号：", orderId, " 状态：一级审批完成负责人", " 时间：", f.format(date), " 审批人：", levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }
}
