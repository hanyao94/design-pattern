/**
 * 项目名：	design-pattern
 * 文件名：	ZKCouponDiscount.java
 * 模块说明：
 * 修改历史：
 * 2021/8/24 - seven - 创建。
 */
package com.seven.refactor.user.impl;

import com.seven.refactor.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author seven
 */
public class ZKCouponDiscount  implements ICouponDiscount<Double> {


  /**
   * 折扣计算
   * 1. 使用商品价格乘以折扣比例，为最后支付金额
   * 2. 保留两位小数
   * 3. 最低支付金额1元
   */
  public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
    BigDecimal discountAmount = skuPrice.multiply(new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_UP);
    if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
    return discountAmount;
  }

}
