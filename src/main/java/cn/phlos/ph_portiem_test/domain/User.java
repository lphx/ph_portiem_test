package cn.phlos.ph_portiem_test.domain;


import lombok.Data;

/**
 * User实体映射类
 * Created by Administrator on 2017/11/24.
 */
@Data
public class User {

    private Integer id;
    private String name;
    private String password;
    private String phone;

    //省略 get 和 set ...
}


