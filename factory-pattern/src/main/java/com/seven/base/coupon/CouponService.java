/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： CouponService.java
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
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid){
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return
                new CouponResult("0000", "发放成功");
    }
}
