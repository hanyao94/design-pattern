/**
 * 项目名：	design-pattern
 * 文件名：	Student.java
 * 模块说明：
 * 修改历史：
 * 2021/8/27 - seven - 创建。
 */
package com.seven.refactor.user.impl;

import com.seven.refactor.user.User;
import com.seven.refactor.visitor.Visitor;

/**
 * @author seven
 */
public class Student extends User {
  public Student(String name, String identity, String clazz) {
    super(name, identity, clazz);
  }

  public void accept(Visitor visitor) {
    visitor.visitor(this);
  }

  public int ranking() {
    return (int) (Math.random() * 100);
  }
}
