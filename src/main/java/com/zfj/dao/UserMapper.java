package com.zfj.dao;

import com.zfj.pojo.User;

/**
 * @Author zfj
 * @create 2019/12/5 19:32
 */
public interface UserMapper {

    //根据用户名查找用户
    User queryUser(String username);

    //添加用户
    int addUser(User user);



}
