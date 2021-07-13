/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： XiaoEr1.java
 * 模块说明：
 * 修改历史：
 * 2021年07月14日 - XX - 创建。
 */
package
        messy;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import refactor.XiaoEr;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author XX
 * @since 1.0
 */
public class XiaoEr1 {
    private Logger logger = LoggerFactory.getLogger(XiaoEr.class);
    private Map<Integer, String> cuisineMap = new
            ConcurrentHashMap<Integer, String>();
    public void order(int cuisine) {
        // ⼴东（粤菜）
        if (1 == cuisine) {
            cuisineMap.put(1, "⼴东厨师，烹饪鲁菜，宫廷最⼤菜系，以孔府⻛味为⻰ 头");
        }
        // 江苏（苏菜）
        if (2 == cuisine) {
            cuisineMap.put(2, "江苏厨师，烹饪苏菜，宫廷第⼆⼤菜系，古今国宴上最受⼈ 欢迎的菜系。");
        }
        // ⼭东（鲁菜）
        if (3 == cuisine) {
            cuisineMap.put(3, "⼭东厨师，烹饪鲁菜，宫廷最⼤菜系，以孔府⻛味为⻰ 头.");
        }
        // 四川（川菜）
        if (4 == cuisine) {
            cuisineMap.put(4, "四川厨师，烹饪川菜，中国最有特⾊的菜系，也是⺠间最⼤ 菜系。");
        }
    }
    public void placeOrder() {
        logger.info("菜单：{}", JSON.toJSONString(cuisineMap));
    }
}
