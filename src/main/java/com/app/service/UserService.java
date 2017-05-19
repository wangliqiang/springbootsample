package com.app.service;

import com.app.bean.Users;
import com.app.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 王立强 on 2017/5/19.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("userService")
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public List<Users> getAllUserInfo() {
        return userMapper.getAllUserInfo();
    }
}
