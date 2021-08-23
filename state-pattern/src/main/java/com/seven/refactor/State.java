/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	design-pattern
 * 文件名：	State.java
 * 模块说明：
 * 修改历史：
 * 2021/8/23 - seven - 创建。
 */
package com.seven.refactor;

import com.seven.base.Status;
import com.seven.messy.Result;

/**
 * @author seven
 */
public abstract class State {
  /**
   * 活动提审
   *
   * @param activityId    活动ID
   * @param currentStatus 当前状态
   * @return 执行结果
   */
  public abstract Result arraignment(String activityId, Enum<Status> currentStatus);

  /**
   * 审核通过
   *
   * @param activityId    活动ID
   * @param currentStatus 当前状态
   * @return 执行结果
   */
  public abstract Result checkPass(String activityId, Enum<Status> currentStatus);

  /**
   * 审核拒绝
   *
   * @param activityId    活动ID
   * @param currentStatus 当前状态
   * @return 执行结果
   */
  public abstract Result checkRefuse(String activityId, Enum<Status> currentStatus);

  /**
   * 撤审撤销
   *
   * @param activityId    活动ID
   * @param currentStatus 当前状态
   * @return 执行结果
   */
  public abstract Result checkRevoke(String activityId, Enum<Status> currentStatus);

  /**
   * 活动关闭
   *
   * @param activityId    活动ID
   * @param currentStatus 当前状态
   * @return 执行结果
   */
  public abstract Result close(String activityId, Enum<Status> currentStatus);

  /**
   * 活动开启
   *
   * @param activityId    活动ID
   * @param currentStatus 当前状态
   * @return 执行结果
   */
  public abstract Result open(String activityId, Enum<Status> currentStatus);

  /**
   * 活动执行
   *
   * @param activityId    活动ID
   * @param currentStatus 当前状态
   * @return 执行结果
   */
  public abstract Result doing(String activityId, Enum<Status> currentStatus);
}
