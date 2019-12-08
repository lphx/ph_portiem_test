package cn.phlos.ph_portiem_test.api;

import cn.phlos.ph_portiem_test.domain.User;
import cn.phlos.ph_portiem_test.service.UserService;
import cn.phlos.ph_portiem_test.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("SwaggerDmeo控制器")
@RestController
public class UserApi {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取分页")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value = "用户参数",required = true,dataType = "String"),
            @ApiImplicitParam(name="name",value = "用户参数",required = true,dataType = "String")
    })
    @PostMapping("/page")
    public  List<User> page(Page page) {
        return userService.page(page);
    }

    @ApiOperation(value = "更新")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PutMapping("/update")
    public String update(User user) {
        userService.update(user);
        return "success";
    }

    @ApiOperation(value = "保存")
    @ApiImplicitParam(name = "user", value = "保存", required = true, dataType = "User")
    @PostMapping("save")
    public int save(User user) {
        int count = userService.save(user);
        return count;
    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id", value = "删除", required = true, dataType = "Integer")
    @DeleteMapping("/remove")
    public String remove(Integer id) {
        userService.remove(id);
        return "success";
    }

    @ApiOperation(value = "条数")
    @GetMapping("/count")
    public int count() {
        return userService.count();
    }

    @ApiOperation(value = "查找一条")
    @ApiImplicitParam(name = "id", value = "查找一条", required = true, dataType = "Integer")
    @GetMapping("/find")
    public User findById(Integer id) {
        return userService.findOne(id);
    }

    @ApiOperation(value = "查找所有")
    @GetMapping("/findAll")
    public List<User> findAllList() {
        return userService.findAllList();
    }

}
