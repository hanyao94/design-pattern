/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： GoodsService.java
 * 模块说明：
 * 修改历史：
 * 2021年06月06日 - XX - 创建。
 */
package com.seven.base.goods;
import com.alibaba.fastjson.JSON;

/**
 * @author XX
 * @since 1.0
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req){
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
