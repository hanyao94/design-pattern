/**
 * 项目名：	design-pattern
 * 文件名：	ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021/8/24 - seven - 创建。
 */

import com.seven.refactor.Context;
import com.seven.refactor.impl.MJCouponDiscount;
import com.seven.refactor.impl.NYGCouponDiscount;
import com.seven.refactor.impl.ZJCouponDiscount;
import com.seven.refactor.impl.ZKCouponDiscount;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author seven
 */
public class ApiTest {

  private Logger logger = LoggerFactory.getLogger(ApiTest.class);

  @Test
  public void test_zj() {
    // 直减；100-10，商品100元
    Context<Double> context = new Context<Double>(new ZJCouponDiscount());
    BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(100));
    logger.info("测试结果：直减优惠后金额 {}", discountAmount);
  }

  @Test
  public void test_mj() {
    // 满100减10，商品100元
    Context<Map<String,String>> context = new Context<Map<String,String>>(new MJCouponDiscount());
    Map<String,String> mapReq = new HashMap<String, String>();
    mapReq.put("x","100");
    mapReq.put("n","10");
    BigDecimal discountAmount = context.discountAmount(mapReq, new BigDecimal(100));
    logger.info("测试结果：满减优惠后金额 {}", discountAmount);
  }


  @Test
  public void test_zk() {
    // 折扣9折，商品100元
    Context<Double> context = new Context<Double>(new ZKCouponDiscount());
    BigDecimal discountAmount = context.discountAmount(0.9D, new BigDecimal(100));
    logger.info("测试结果：折扣9折后金额 {}", discountAmount);
  }

  @Test
  public void test_nyg() {
    // n元购；100-10，商品100元
    Context<Double> context = new Context<Double>(new NYGCouponDiscount());
    BigDecimal discountAmount = context.discountAmount(90D, new BigDecimal(100));
    logger.info("测试结果：n元购优惠后金额 {}", discountAmount);
  }

}
