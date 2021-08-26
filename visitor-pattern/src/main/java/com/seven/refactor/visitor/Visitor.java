/**
 * 项目名：	design-pattern
 * 文件名：	Visitor.java
 * 模块说明：
 * 修改历史：
 * 2021/8/27 - seven - 创建。
 */
package com.seven.refactor.visitor;

import com.seven.refactor.user.impl.Student;
import com.seven.refactor.user.impl.Teacher;

/**
 * @author seven
 */
public interface Visitor {
  void visitor(Student student);
  void visitor(Teacher teacher);
}
