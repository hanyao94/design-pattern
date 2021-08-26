/**
 * 项目名：	design-pattern
 * 文件名：	Teacher.java
 * 模块说明：
 * 修改历史：
 * 2021/8/27 - seven - 创建。
 */
package com.seven.refactor.user.impl;

import com.seven.refactor.user.User;
import com.seven.refactor.visitor.Visitor;

import java.math.BigDecimal;

/**
 * @author seven
 */
public class Teacher extends User {
  public Teacher(String name, String identity, String clazz) {
    super(name, identity, clazz);
  }

  public void accept(Visitor visitor) {
    visitor.visitor(this);
  }

  // 升本率
  public double entranceRatio() {
    return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
  }
}
