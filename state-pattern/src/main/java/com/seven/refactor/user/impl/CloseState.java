/**
 * 项目名：	design-pattern
 * 文件名：	CloseState.java
 * 模块说明：
 * 修改历史：
 * 2021/8/23 - seven - 创建。
 */
package com.seven.refactor.user.impl;

import com.seven.base.ActivityService;
import com.seven.base.Status;
import com.seven.messy.Result;
import com.seven.refactor.State;

/**
 * @author seven
 */
public class CloseState extends State {

  public Result arraignment(String activityId, Enum<Status> currentStatus) {
    return new Result("0001", "活动关闭不可提审");
  }

  public Result checkPass(String activityId, Enum<Status> currentStatus) {
    return new Result("0001", "活动关闭不可审核通过");
  }

  public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
    return new Result("0001", "活动关闭不可审核拒绝");
  }

  @Override
  public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
    return new Result("0001", "活动关闭不可撤销审核");
  }

  public Result close(String activityId, Enum<Status> currentStatus) {
    return new Result("0001", "活动关闭不可重复关闭");
  }

  public Result open(String activityId, Enum<Status> currentStatus) {
    ActivityService.execStatus(activityId, currentStatus, Status.Open);
    return new Result("0000", "活动开启完成");
  }

  public Result doing(String activityId, Enum<Status> currentStatus) {
    return new Result("0001", "活动关闭不可变更活动中");
  }

}