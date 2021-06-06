/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： CouponResult.java
 * 模块说明：
 * 修改历史：
 * 2021年06月06日 - XX - 创建。
 */
package
        com.seven.base.coupon;


/**
 * @author XX
 * @since 1.0
 */
public class CouponResult {
    private String code; // 编码
    private String info; // 描述

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
