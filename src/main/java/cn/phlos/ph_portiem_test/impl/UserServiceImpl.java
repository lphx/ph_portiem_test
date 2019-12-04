package cn.phlos.ph_portiem_test.impl;

import cn.phlos.ph_portiem_test.domain.User;
import cn.phlos.ph_portiem_test.mapper.UserMapper;
import cn.phlos.ph_portiem_test.service.UserService;
import cn.phlos.ph_portiem_test.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void page(Page page) {

    }

    public void update(User user) {

    }

    public void save(User user) {
        userMapper.insert(user);
    }

    public void remove(String id) {

    }

    public int count() {
        return 0;
    }

    public User findOne(Integer id) {
        return userMapper.findOne(id);
    }

    public List<User> findAllList() {
        return null;
    }
}
