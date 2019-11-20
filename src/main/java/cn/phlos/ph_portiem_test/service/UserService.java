package cn.phlos.ph_portiem_test.service;

import cn.phlos.ph_portiem_test.domain.User;
import cn.phlos.ph_portiem_test.util.Page;

import java.util.List;

public interface UserService {

    void page(Page page);
    void update(User user);
    void save(User user);
    void remove(String id);
    int count();
    User findOne(String id);
    List<User> findAllList();
}
