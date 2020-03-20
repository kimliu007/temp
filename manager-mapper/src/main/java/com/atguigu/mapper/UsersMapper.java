package com.atguigu.mapper;

import com.atguigu.pojo.Users;

import java.util.List;

/**
 * @Author: Kim Liu
 * @Date: 2020/3/19
 * @Description: com.atguigu.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUsersAll();
}
