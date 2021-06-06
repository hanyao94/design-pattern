/**
 * 项目名：	design-pattern
 * 文件名：	PrizeController.java
 * 模块说明：
 * 修改历史：
 * 2021/6/2 - seven - 创建。
 */
package com.seven.messy;


import com.alibaba.fastjson.JSON;
import com.seven.base.card.IQiYiCardService;
import com.seven.base.coupon.CouponResult;
import com.seven.base.coupon.CouponService;
import com.seven.base.goods.DeliverReq;
import com.seven.base.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author seven
 */
public class PrizeController {
    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req){
        logger.info("奖品发放开始{}。req:{}",req.getuId(), JSON.toJSONString(req));

        AwardRes awardRes = null;
        // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
        if (req.getAwardType() == 1){
            CouponService couponService = new CouponService();
            CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
            if ("0000".equals(couponResult.getCode())) {
                awardRes = new AwardRes("0000", "发放成功");
            } else {
                awardRes = new AwardRes("0001", couponResult.getInfo());
            }
        }else if (req.getAwardType() == 2){
            GoodsService goodsService = new GoodsService();
            DeliverReq deliverReq = new DeliverReq();
            deliverReq.setUserName(queryUserName(req.getuId()));
            deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
            deliverReq.setSku(req.getAwardNumber());
            deliverReq.setOrderId(req.getBizId());
            deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
            deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
            deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
            Boolean isSuccess = goodsService.deliverGoods(deliverReq);
            if (isSuccess) {
                awardRes = new AwardRes("0000", "发放成功");
            } else {
                awardRes = new AwardRes("0001", "发放失败");
            }

        }else if(req.getAwardType() == 3){
            String bindMobileNumber = queryUserPhoneNumber(req.getuId());
            IQiYiCardService iQiYiCardService = new IQiYiCardService();
            iQiYiCardService.grantToken(bindMobileNumber, req.getAwardNumber());
            awardRes = new AwardRes("0000", "发放成功");
        }

        return  awardRes;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }

}
