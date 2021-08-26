/**
 * 项目名：	design-pattern
 * 文件名：	Princial.java
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
public class Princial implements Visitor {
  private Logger logger = LoggerFactory.getLogger(Princial.class);

  public void visitor(Student student) {
    logger.info("学生信息 姓名：{} 班级：{}", student.name, student.clazz);
  }

  public void visitor(Teacher teacher) {
    logger.info("学生信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());
  }
}
