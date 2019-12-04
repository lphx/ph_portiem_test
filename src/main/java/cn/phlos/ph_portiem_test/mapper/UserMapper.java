package cn.phlos.ph_portiem_test.mapper;


import cn.phlos.ph_portiem_test.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * User映射类
 * Created by Administrator on 2017/11/24.
 */
@Mapper
public interface UserMapper {

    @Select({"SELECT id, name,password,phone FROM t_user"})
    @Results(id = "userSelect",value={
            @Result(id=true,column="id",property="id",javaType=Integer.class),
            @Result(id=true,column="name",property="name",javaType=String.class),
            @Result(id=true,column="password",property="password",javaType=String.class),
            @Result(id=true,column="phone",property="phone",javaType=String.class),
    })
    public List<User> findAllList();

    @Select("SELECT id, name,password,phone FROM t_user WHERE id = #{id}")
    @ResultMap(value = "userSelect")
    User findOne(@Param("id") Integer id);

    @Insert("INSERT INTO t_user(name, password, phone) VALUES(#{name}, #{password}, #{phone})")
    int insert(User user);

}


