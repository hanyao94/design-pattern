/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： ApiTest.java
 * 模块说明：
 * 修改历史：
 * 2021年06月11日 - XX - 创建。
 */

import org.junit.Test;
import refactor.CacheService;
import refactor.adapter.JDKProxy;
import refactor.adapter.impl.EGMCacheAdapter;
import refactor.adapter.impl.IIRCacheAdapter;
import refactor.impl.CacheServiceImpl;

/**
 * @author XX
 * @since 1.0
 */
public class ApiTest {

    @Test
    public  void test(){
        // CacheService cacheService = new CacheServiceImpl();
        // cacheService.set("1212","111",1);
        // String value = cacheService.get("1212",1);
        // System.out.println(value);
    }

    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }

}
