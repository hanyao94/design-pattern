/**
 * 项目名：	design-pattern
 * 文件名：	user.java
 * 模块说明：
 * 修改历史：
 * 2021/8/27 - seven - 创建。
 */
package com.seven.refactor.user;

import com.seven.refactor.visitor.Visitor;

/**
 * @author seven
 */
public abstract class User {
  public String name;
  public String identity;
  public String clazz;

  public User(String name, String identity, String clazz) {
    this.name = name;
    this.identity = identity;
    this.clazz = clazz;
  }

  public abstract void accept(Visitor visitor);
}
