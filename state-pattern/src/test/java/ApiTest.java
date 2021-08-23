/**
 * 项目名：	design-pattern
 * 文件名：	ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021/8/24 - seven - 创建。
 */

import com.alibaba.fastjson.JSON;
import com.seven.base.ActivityService;
import com.seven.base.Status;
import com.seven.messy.Result;
import com.seven.refactor.StateHandler;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author seven
 */
public class ApiTest {

  private Logger logger = LoggerFactory.getLogger(ApiTest.class);

  @Test
  public void test_Editing2Arraignment() {
    String activityId = "100001";
    ActivityService.init(activityId, Status.Editing);

    StateHandler stateHandler = new StateHandler();
    Result result = stateHandler.arraignment(activityId, Status.Editing);

    logger.info("测试结果(编辑中To提审活动)：{}", JSON.toJSONString(result));
    logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
  }

  @Test
  public void test_Editing2Open() {
    String activityId = "100001";
    ActivityService.init(activityId, Status.Editing);

    StateHandler stateHandler = new StateHandler();
    Result result = stateHandler.open(activityId, Status.Editing);

    logger.info("测试结果(编辑中To开启活动)：{}", JSON.toJSONString(result));
    logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
  }

  @Test
  public void test_Refuse2Doing() {
    String activityId = "100001";
    ActivityService.init(activityId, Status.Refuse);

    StateHandler stateHandler = new StateHandler();
    Result result = stateHandler.doing(activityId, Status.Refuse);

    logger.info("测试结果(拒绝To活动中)：{}", JSON.toJSONString(result));
    logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
  }

  @Test
  public void test_Refuse2Revoke() {
    String activityId = "100001";
    ActivityService.init(activityId, Status.Refuse);

    StateHandler stateHandler = new StateHandler();
    Result result = stateHandler.checkRevoke(activityId, Status.Refuse);

    logger.info("测试结果(拒绝To撤审)：{}", JSON.toJSONString(result));
    logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
  }
}
