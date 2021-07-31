package refactor.dao;

import refactor.po.School;

public interface ISchoolDao {
    School querySchoolInfoById(Long treeId);
}
