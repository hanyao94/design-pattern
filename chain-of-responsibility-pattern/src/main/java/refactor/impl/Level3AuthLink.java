/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： Level2AuthLink.java
 * 模块说明：
 * 修改历史：
 * 2021年07月13日 - XX - 创建。
 */
package
        refactor.impl;

import base.AuthInfo;
import base.AuthService;
import refactor.AuthLink;

import java.text.ParseException;
import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class Level3AuthLink extends AuthLink {
    private Date beginDate = f.parse("2020-06-01 00:00:00");
    private Date endDate = f.parse("2020-06-25 23:59:59");
    public Level3AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待三级审批 负责⼈ ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：三级审批负 责⼈完成", " 时间：", f.format(date), " 审批⼈：", levelUserName);
        }
        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：三级审批负 责⼈完成", " 时间：", f.format(date), " 审批⼈：", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }
}
