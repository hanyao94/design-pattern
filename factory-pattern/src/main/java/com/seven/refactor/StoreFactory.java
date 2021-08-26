/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	design-pattern
 * 文件名：	StoreFactory.java
 * 模块说明：
 * 修改历史：
 * 2021/6/2 - seven - 创建。
 */
package com.seven.refactor;

import com.seven.refactor.user.impl.CardCommodityService;
import com.seven.refactor.user.impl.CouponCommodityService;
import com.seven.refactor.user.impl.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author seven
 */
public class StoreFactory {
    private final Integer TYPE_COUPON = 1;
    private final Integer TYPE_GOODS = 2;
    private final Integer TYPE_CARD = 3;

    //模擬注入
    private ICommodity couponCommodityService = new CouponCommodityService();
    private ICommodity goodsCommodityService = new GoodsCommodityService();
    private ICommodity cardCommodityService = new CardCommodityService();

    private Map<Integer,ICommodity> commodityMap = new HashMap<Integer, ICommodity>();

    public StoreFactory() {
        commodityMap.put(TYPE_COUPON, couponCommodityService);
        commodityMap.put(TYPE_GOODS, goodsCommodityService);
        commodityMap.put(TYPE_CARD, cardCommodityService);
    }

    public ICommodity getCommodityService(Integer commodityType) {
        ICommodity iCommodity = commodityMap.get(commodityType);
        if (iCommodity == null){
            throw new RuntimeException("不存在的商品服务类型");
        }
        return iCommodity;
    }

}
