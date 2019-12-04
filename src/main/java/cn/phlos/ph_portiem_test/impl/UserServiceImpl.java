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

    public  List<User> page(Page page) {
        return userMapper.page(page);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public int save(User user) {
        return userMapper.save(user);
    }

    public void remove(Integer id) {
        userMapper.remove(id);
    }

    public int count() {
        return userMapper.count();
    }

    public User findOne(Integer id) {
        return userMapper.findOne(id);
    }

    public List<User> findAllList() {
        return userMapper.findAllList();
    }
}
