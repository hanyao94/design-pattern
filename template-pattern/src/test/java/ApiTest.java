/**
 * 项目名：	design-pattern
 * 文件名：	ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021/8/26 - seven - 创建。
 */

import com.sevem.refactor.NetMall;
import com.sevem.refactor.impl.JDNetMall;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author seven
 */
public class ApiTest {

  public Logger logger = LoggerFactory.getLogger(ApiTest.class);

  /**
   * 测试链接
   * 京东；https://item.jd.com/100008348542.html
   * 淘宝；https://detail.tmall.com/item.htm
   * 当当；http://product.dangdang.com/1509704171.html
   */
  @Test
  public void test_NetMall() {
    NetMall netMall = new JDNetMall("1000001", "*******");
    String base64 = netMall.generateGoodsPoster("https://item.jd.com/100008348542.html");
    logger.info("测试结果：{}", base64);
  }
}
