/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	design-pattern
 * 文件名：	Status.java
 * 模块说明：
 * 修改历史：
 * 2021/8/23 - seven - 创建。
 */
package com.seven.base;

/**
 * @author seven
 */
public enum Status {
  // 1创建编辑、2待审核、3审核通过(任务扫描成活动中)、4审核拒绝(可以撤审到编辑状态)、5活动中、6活动关闭、7活动开启(任务扫描成活动中)
  Editing, Check, Pass, Refuse, Doing, Close, Open
}
