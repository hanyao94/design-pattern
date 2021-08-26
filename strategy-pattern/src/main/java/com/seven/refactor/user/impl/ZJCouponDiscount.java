/**
 * 项目名：	design-pattern
 * 文件名：	ZJCouponDiscount.java
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
public class ZJCouponDiscount implements ICouponDiscount<Double> {

  /**
   * 直减计算
   * 1. 使用商品价格减去优惠价格
   * 2. 最低支付金额1元
   */
  public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
    BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
    if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
    return discountAmount;
  }

}
