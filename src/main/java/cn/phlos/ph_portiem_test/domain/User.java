package cn.phlos.ph_portiem_test.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * User实体映射类
 * Created by Administrator on 2017/11/24.
 */
@ApiModel(value = "用户对象")
@Data
public class User {

    @ApiModelProperty(value = "id",name = "id")
    private Integer id;
    @ApiModelProperty(value = "名字",name = "name")
    private String name;
    @ApiModelProperty(value = "密码",name = "password")
    private String password;
    @ApiModelProperty(value = "手机",name = "phone")
    private String phone;

    //省略 get 和 set ...
}


