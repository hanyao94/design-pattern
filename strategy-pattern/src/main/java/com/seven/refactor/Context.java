/**
 * 项目名：	design-pattern
 * 文件名：	Context.java
 * 模块说明：
 * 修改历史：
 * 2021/8/24 - seven - 创建。
 */
package com.seven.refactor;

import java.math.BigDecimal;

/**
 * @author seven
 */
public class Context<T> {
  private ICouponDiscount<T> couponDiscount;

  public Context(ICouponDiscount<T> couponDiscount) {
    this.couponDiscount = couponDiscount;
  }

  public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice){
    return couponDiscount.discountAmount(couponInfo, skuPrice);
  }
}
