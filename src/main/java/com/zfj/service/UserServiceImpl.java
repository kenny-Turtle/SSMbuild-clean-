package com.zfj.service;

import com.zfj.dao.UserMapper;
import com.zfj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zfj
 * @create 2019/12/5 19:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User queryUser(String username) {
        return userMapper.queryUser(username);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
