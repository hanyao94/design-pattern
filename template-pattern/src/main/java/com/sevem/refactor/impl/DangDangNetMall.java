/**
 * 项目名：	design-pattern
 * 文件名：	DangDangNetMall.java
 * 模块说明：
 * 修改历史：
 * 2021/8/25 - seven - 创建。
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
public class DangDangNetMall extends NetMall {
  public DangDangNetMall(String uId, String uPwd) {
    super(uId, uPwd);
  }

  public Boolean login(String uId, String uPwd) {
    logger.info("模拟当当用户登录 uId：{} uPwd：{}", uId, uPwd);
    return true;
  }

  public Map<String, String> retile(String skuUrl) {
    String str = HttpClient.doGet(skuUrl);
    Pattern p9 = Pattern.compile("(?<=title\\>).*(?=</title)");
    Matcher m9 = p9.matcher(str);
    Map<String, String> map = new ConcurrentHashMap<String, String>();
    if (m9.find()) {
      map.put("name", m9.group());
    }
    map.put("price", "4548.00");
    logger.info("模拟当当商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
    return map;
  }

  public String createBase64(Map<String, String> goodsInfo) {
    BASE64Encoder encoder = new BASE64Encoder();
    logger.info("模拟生成当当商品base64海报");
    return encoder.encode(JSON.toJSONString(goodsInfo).getBytes());
  }
}
