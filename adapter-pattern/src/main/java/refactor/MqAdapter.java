/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： MqAdapter.java
 * 模块说明：
 * 修改历史：
 * 2021年06月21日 - XX - 创建。
 */
package
        refactor;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author XX
 * @since 1.0
 */
public class MqAdapter {

    public static RebateInfo filter(String json, Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        Map obj = JSON.parseObject(json,Map.class);

        for (String key: link.keySet()){
            Object val = obj.get(link.get(key));
            RebateInfo.class.getMethod("set"+key.substring(0,1).toUpperCase() + key.substring(1).toUpperCase(),String.class).invoke(rebateInfo,val.toString());
        }
        return rebateInfo;
    }
}
