/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： UserGenderFilter.java
 * 模块说明：
 * 修改历史：
 * 2021年06月26日 - XX - 创建。
 */
package
        refactor.logic.impl;

import refactor.logic.BaseLogicFilter;

import java.util.Map;

/**
 * @author XX
 * @since 1.0
 */
public class UserGenderFilter extends BaseLogicFilter {
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
