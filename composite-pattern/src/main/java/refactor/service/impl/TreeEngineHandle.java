/**
 * 版权所有(C)，XX有限公司，2021，所有权利保留。
 * <p>
 * 项目名： design-pattern
 * 文件名： TreeEngineHandle.java
 * 模块说明：
 * 修改历史：
 * 2021年06月26日 - XX - 创建。
 */
package
        refactor.service.impl;

import refactor.model.EngineResult;
import refactor.model.TreeNode;
import refactor.model.TreeRich;
import refactor.service.EngineBase;

import java.util.Map;

/**
 * @author XX
 * @since 1.0
 */
public class TreeEngineHandle extends EngineBase {
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
