/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年06月23日 - XX - 创建。
 */

import messy.PayController;
import org.junit.Test;
import refactor.channel.Pay;
import refactor.channel.WxPay;
import refactor.channel.ZfbPay;
import refactor.mode.PayFaceMode;
import refactor.mode.PayFingerprintMode;

import java.math.BigDecimal;

/**
 * @author XX
 * @since 1.0
 */
public class ApiTest {
    @Test
    public void test_pay() {
        PayController pay = new PayController();

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), 1, 2);

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        pay.doPay("jlu19dlxo111","100000109894",new BigDecimal(100), 2, 3);
    }

    @Test
    public void test_bridge(){
        System.out.println("\r\n模拟测试场景；微信⽀付、⼈脸⽅式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new
                BigDecimal(100));
        System.out.println("\r\n模拟测试场景；⽀付宝⽀付、指纹⽅式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }
}
