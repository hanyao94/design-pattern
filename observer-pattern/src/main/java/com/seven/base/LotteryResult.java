/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： LotteryResult.java
 * 模块说明：
 * 修改历史：
 * 2021年08月15日 - XX - 创建。
 */
package
        com.seven.base;

import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class LotteryResult {
    private String uId;    // 用户ID
    private String msg;    // 摇号信息
    private Date dateTime; // 业务时间

    public LotteryResult(String uId, String msg, Date dateTime) {
        this.uId = uId;
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
