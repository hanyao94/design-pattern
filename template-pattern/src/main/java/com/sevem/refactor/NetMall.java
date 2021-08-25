/**
 * 项目名：	design-pattern
 * 文件名：	NetMall.java
 * 模块说明：
 * 修改历史：
 * 2021/8/25 - seven - 创建。
 */
package com.sevem.refactor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author seven
 */
public abstract class NetMall {
  protected Logger logger = LoggerFactory.getLogger(NetMall.class);

  String uId;   // 用户ID
  String uPwd;  // 用户密码

  public NetMall(String uId, String uPwd) {
    this.uId = uId;
    this.uPwd = uPwd;
  }

  public String  generateGoodsPoster(String skuUrl){
    if (!login(uId,uPwd)) return null;
    Map<String, String> retile = retile(skuUrl);
    return  createBase64(retile);
  }

  protected abstract Boolean login(String uId,String uPwd);

  protected abstract Map<String,String> retile(String skuUrl);

  protected abstract String createBase64(Map<String,String> goodsInfo);
}
