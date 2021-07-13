/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年07月14日 - XX - 创建。
 */

import base.ICook;
import messy.XiaoEr1;
import org.junit.Test;
import refactor.XiaoEr;
import refactor.impl.GuangDongCook;
import refactor.impl.JiangSuCook;
import refactor.impl.ShanDongCook;
import refactor.impl.SiChuanCook;

/**
 * @author XX
 * @since 1.0
 */
public class ApiTest {

    @Test
    public void test1(){
        XiaoEr1 xiaoEr1 = new XiaoEr1();
        xiaoEr1.order(1);
        xiaoEr1.placeOrder();
    }

    @Test
    public void test(){
        ICook gCooke = new GuangDongCook();
        ICook jCooke = new JiangSuCook();
        ICook sCooke = new ShanDongCook();
        ICook siCooke = new SiChuanCook();

        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(gCooke);
        xiaoEr.order(jCooke);
        xiaoEr.order(sCooke);
        xiaoEr.order(siCooke);

        xiaoEr.placeOrder();
    }
}
