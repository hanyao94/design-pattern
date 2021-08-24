/**
 * 项目名：	design-pattern
 * 文件名：	CouponDiscountService.java
 * 模块说明：
 * 修改历史：
 * 2021/8/24 - seven - 创建。
 */
package com.seven.messy;

/**
 * @author seven
 */
public class CouponDiscountService {
  public double discountAmount(int type, double typeContent, double skuPrice, double typeExt) {
    // 1. 直减券
    if (1 == type) {
      return skuPrice - typeContent;
    }
    // 2. 满减券
    if (2 == type) {
      if (skuPrice < typeExt) return skuPrice;
      return skuPrice - typeContent;
    }
    // 3. 折扣券
    if (3 == type) {
      return skuPrice * typeContent;
    }
    // 4. n元购
    if (4 == type) {
      return typeContent;
    }
    return 0D;
  }
}
