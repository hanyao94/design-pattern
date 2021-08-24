/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	design-pattern
 * 文件名：	ICouponDiscount.java
 * 模块说明：
 * 修改历史：
 * 2021/8/24 - seven - 创建。
 */
package com.seven.refactor;

import java.math.BigDecimal;

/**
 * @author seven
 */
public interface ICouponDiscount<T> {
  BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);

}
