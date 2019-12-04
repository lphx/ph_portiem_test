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

    @GetMapping("/page")
    public void page(Page page) {

    }

    @PutMapping("/update")
    public void update(User user) {

    }

    @PostMapping("save")
    public void save(User user) {
        userService.save(user);
    }

    @DeleteMapping("/remove")
    public void remove(String id) {

    }

    @GetMapping("/count")
    public int count() {
        return 0;
    }

    @GetMapping("find")
    public User findById(Integer id) {
        return userService.findOne(id);
    }

    @GetMapping("/findAll")
    public List<User> findAllList() {
        return null;
    }

}
