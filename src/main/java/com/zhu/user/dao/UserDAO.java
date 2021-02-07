package com.zhu.user.dao;

import com.zhu.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDAO {
    List<User> getUserList(User searchUser);

    User getUserById(@Param("id") int id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(@Param("id") int id);
}
