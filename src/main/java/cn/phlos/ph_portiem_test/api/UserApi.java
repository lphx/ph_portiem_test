package cn.phlos.ph_portiem_test.api;

import cn.phlos.ph_portiem_test.domain.User;
import cn.phlos.ph_portiem_test.service.UserService;
import cn.phlos.ph_portiem_test.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserApi {

    @Autowired
    private UserService userService;

    @GetMapping
    public void page(Page page) {

    }

    @PutMapping
    public void update(User user) {

    }

    @PostMapping
    public void save(User user) {

    }

    @DeleteMapping
    public void remove(String id) {

    }

    @GetMapping
    public int count() {
        return 0;
    }

    @GetMapping
    public User findById(String id) {
        return userService.findOne(id);
    }

    @GetMapping
    public List<User> findAllList() {
        return null;
    }

}
