/**
 * 项目名：	design-pattern
 * 文件名：	NYGCouponDiscount.java
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
public class NYGCouponDiscount implements ICouponDiscount<Double> {

  /**
   * n元购购买
   * 1. 无论原价多少钱都固定金额购买
   */
  public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
    return new BigDecimal(couponInfo);
  }

}
