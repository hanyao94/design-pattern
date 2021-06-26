package refactor.service;

import refactor.model.EngineResult;
import refactor.model.TreeRich;

import java.util.Map;

public interface IEngine {
    EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String,String> decisionMatter);
}
