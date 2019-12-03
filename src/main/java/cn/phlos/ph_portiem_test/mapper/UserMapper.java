package cn.phlos.ph_portiem_test.mapper;


import cn.phlos.ph_portiem_test.domain.User;
import org.apache.ibatis.annotations.*;

/**
 * User映射类
 * Created by Administrator on 2017/11/24.
 */
@Mapper
public interface UserMapper {

    @Results(id = "userSelect",value={
            @Result(id=true,column="id",property="id",javaType=Integer.class),
            @Result(id=true,column="name",property="name",javaType=String.class),
            @Result(id=true,column="password",property="password",javaType=String.class),
            @Result(id=true,column="phone",property="phone",javaType=String.class),
    })

    @Select("SELECT * FROM t_user WHERE PHONE = #{id}")
    @ResultMap(value = "userSelect")
    User findOne(@Param("id") String id);

    @Insert("INSERT INTO t_user(name, password, phone) VALUES(#{name}, #{password}, #{phone})")
    int insert(User user);

}


