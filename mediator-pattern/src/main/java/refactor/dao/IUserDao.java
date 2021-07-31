package refactor.dao;

import refactor.po.User;

public interface IUserDao {
    User queryUserInfoById(Long id);

}
