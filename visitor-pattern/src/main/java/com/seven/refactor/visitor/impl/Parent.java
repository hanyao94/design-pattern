/**
 * 项目名：	design-pattern
 * 文件名：	Parent.java
 * 模块说明：
 * 修改历史：
 * 2021/8/27 - seven - 创建。
 */
package com.seven.refactor.visitor.impl;

import com.seven.refactor.user.impl.Student;
import com.seven.refactor.user.impl.Teacher;
import com.seven.refactor.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author seven
 */
public class Parent implements Visitor {
  private Logger logger = LoggerFactory.getLogger(Parent.class);

  public void visitor(Student student) {
    logger.info("学生信息 姓名：{} 班级：{} 排名：{}", student.name, student.clazz, student.ranking());
  }

  public void visitor(Teacher teacher) {
    logger.info("老师信息 姓名：{} 班级：{} 级别：{}", teacher.name, teacher.clazz, teacher.identity);
  }
}
