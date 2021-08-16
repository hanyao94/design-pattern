/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： MinibusTargetService.java
 * 模块说明：
 * 修改历史：
 * 2021年08月15日 - XX - 创建。
 */
package
        com.seven.base;

/**
 * @author XX
 * @since 1.0
 */
public class MinibusTargetService {
    /**
     * 模拟摇号，但不是摇号算法
     *
     * @param uId ⽤户编号
     * @return 结果
     */
    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? "恭喜你，编 码".concat(uId).concat("在本次摇号中签") : "很遗憾，编 码".concat(uId).concat("在本次摇号未中签或摇号资格已过期");
    }

}
