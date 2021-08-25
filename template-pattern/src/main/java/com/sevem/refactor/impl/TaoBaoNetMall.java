/**
 * 项目名：	design-pattern
 * 文件名：	TaoBaoNetMall.java
 * 模块说明：
 * 修改历史：
 * 2021/8/26 - seven - 创建。
 */
package com.sevem.refactor.impl;

import com.alibaba.fastjson.JSON;
import com.sevem.refactor.HttpClient;
import com.sevem.refactor.NetMall;
import sun.misc.BASE64Encoder;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author seven
 */
public class TaoBaoNetMall extends NetMall {

  public TaoBaoNetMall(String uId, String uPwd) {
    super(uId, uPwd);
  }

  @Override
  public Boolean login(String uId, String uPwd) {
    logger.info("模拟淘宝用户登录 uId：{} uPwd：{}", uId, uPwd);
    return true;
  }

  @Override
  public Map<String, String> retile(String skuUrl) {
    String str = HttpClient.doGet(skuUrl);
    Pattern p9 = Pattern.compile("(?<=title\\>).*(?=</title)");
    Matcher m9 = p9.matcher(str);
    Map<String, String> map = new ConcurrentHashMap<String, String>();
    if (m9.find()) {
      map.put("name", m9.group());
    }
    map.put("price", "4799.00");
    logger.info("模拟淘宝商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
    return map;
  }

  @Override
  public String createBase64(Map<String, String> goodsInfo) {
    BASE64Encoder encoder = new BASE64Encoder();
    logger.info("模拟生成淘宝商品base64海报");
    return encoder.encode(JSON.toJSONString(goodsInfo).getBytes());
  }

}
