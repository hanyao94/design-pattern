/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： POPOrderDelivered.java
 * 模块说明：
 * 修改历史：
 * 2021年06月21日 - XX - 创建。
 */
package
        base.mq;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author XX
 * @since 1.0
 */
public class POPOrderDelivered {
    private String uId;     // 用户ID
    private String orderId; // 订单号
    private Date orderTime; // 下单时间
    private String sku;       // 商品
    private Date skuName;   // 商品名称
    private BigDecimal decimal; // 金额

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Date getSkuName() {
        return skuName;
    }

    public void setSkuName(Date skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }
}
