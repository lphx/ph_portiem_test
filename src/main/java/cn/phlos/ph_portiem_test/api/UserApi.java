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

    @PostMapping("/page")
    public  List<User> page(Page page) {
        return userService.page(page);
    }

    @PutMapping("/update")
    public String update(User user) {
        userService.update(user);
        return "success";
    }

    @PostMapping("save")
    public int save(User user) {
        int count = userService.save(user);
        return count;
    }

    @DeleteMapping("/remove")
    public String remove(Integer id) {
        userService.remove(id);
        return "success";
    }

    @GetMapping("/count")
    public int count() {
        return userService.count();
    }

    @GetMapping("find")
    public User findById(Integer id) {
        return userService.findOne(id);
    }

    @GetMapping("/findAll")
    public List<User> findAllList() {
        return userService.findAllList();
    }

}
