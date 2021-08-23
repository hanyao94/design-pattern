/**
 * 项目名：	design-pattern
 * 文件名：	Result.java
 * 模块说明：
 * 修改历史：
 * 2021/8/23 - seven - 创建。
 */
package com.seven.messy;

/**
 * @author seven
 */
public class Result {
  private String code; // 编码
  private String info; // 描述

  public Result(String code, String info) {
    this.code = code;
    this.info = info;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}
