package com.app.service;

import com.app.common.PageData;
import com.app.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 王立强 on 2017/5/19.
 */
@Service("userService")
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public List<PageData> listAll(){
        return userMapper.listAll();
    }

    public PageData findOne(String id){
        return userMapper.findOne(id);
    }
}
