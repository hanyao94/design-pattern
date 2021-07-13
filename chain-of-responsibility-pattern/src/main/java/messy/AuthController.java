/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： AuthController.java
 * 模块说明：
 * 修改历史：
 * 2021年07月13日 - XX - 创建。
 */
package
        messy;

import base.AuthInfo;
import base.AuthService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class AuthController {
    private SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public AuthInfo doAuth(String uId, String orderId, Date authDate) throws ParseException {
        Date date = AuthService.queryAuthInfo(uId,orderId);
        if (date == null){
            return new AuthInfo("0001", "单号：", orderId, " 状态：待三级审批负责⼈ ", "王⼯");
        }
        // ⼆级审批
        if (authDate.after(f.parse("2020-06-01 00:00:00")) &&
                authDate.before(f.parse("2020-06-25 23:59:59"))) {
            date = AuthService.queryAuthInfo("1000012", orderId);
            if (null == date) return new AuthInfo("0001", "单号：",
                    orderId, " 状态：待⼆级审批负责⼈ ", "张经理");
        }
        // ⼀级审批
        if (authDate.after(f.parse("2020-06-11 00:00:00")) &&
                authDate.before(f.parse("2020-06-20 23:59:59"))) {
            date = AuthService.queryAuthInfo("1000011", orderId);
            if (null == date) return new AuthInfo("0001", "单号：",
                    orderId, " 状态：待⼀级审批负责⼈ ", "段总");
        }
        return new AuthInfo("0001", "单号：", orderId, " 状态：审批完成");
    }
}
