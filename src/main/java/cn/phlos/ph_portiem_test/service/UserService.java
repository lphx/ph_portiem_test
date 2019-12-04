package cn.phlos.ph_portiem_test.service;

import cn.phlos.ph_portiem_test.domain.User;
import cn.phlos.ph_portiem_test.util.Page;

import java.util.List;

public interface UserService {

    List<User> page(Page page);
    void update(User user);
    int save(User user);
    void remove(Integer id);
    int count();
    User findOne(Integer id);
    List<User> findAllList();
}
