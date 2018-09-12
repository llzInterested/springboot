package com.llz.springboot.mapper;

import com.llz.springboot.entity.User;
import org.apache.ibatis.annotations.*;
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);

    @Delete("delete from user where id=#{id}")
    public int deleteUserById(Integer id);

//  使用自动生成的主键
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user(u_name,deptId) values(#{uName},#{deptId})")
    public int insertUser(User user);

    @Update("update user set u_name=#{uName} where id=#{id}")
    public int updateUser(User user);
}
