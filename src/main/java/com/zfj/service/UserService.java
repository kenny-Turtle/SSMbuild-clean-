package com.zfj.service;

import com.zfj.pojo.User;

/**
 * @Author zfj
 * @create 2019/12/5 19:41
 */
public interface UserService {

    //根据用户名查找用户
    User queryUser(String username);

    //添加用户
    int addUser(User user);
}
