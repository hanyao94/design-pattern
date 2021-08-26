/**
 * 项目名：	design-pattern
 * 文件名：	MJCouponDiscount.java
 * 模块说明：
 * 修改历史：
 * 2021/8/24 - seven - 创建。
 */
package com.seven.refactor.user.impl;

import com.seven.refactor.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author seven
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String,String>> {
  /**
   * 满减计算
   * 1. 判断满足x元后-n元，否则不减
   * 2. 最低支付金额1元
   */
  public BigDecimal discountAmount(Map<String,String> couponInfo, BigDecimal skuPrice) {
    String x = couponInfo.get("x");
    String o = couponInfo.get("n");

    // 小于商品金额条件的，直接返回商品原价
    if (skuPrice.compareTo(new BigDecimal(x)) < 0) return skuPrice;
    // 减去优惠金额判断
    BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
    if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;

    return discountAmount;
  }
}