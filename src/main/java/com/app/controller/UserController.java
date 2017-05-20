package com.app.controller;

import com.app.bean.Users;
import com.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 王立强 on 2017/5/19.
 */
@RestController
@EnableAutoConfiguration
public class UserController {

    final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * mybatis查询语句返回集合测试
     *
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<Users> getAllUserInfo() {
        return (userService.getAllUserInfo());
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getString(){
        return "Hello SpringBoot";
    }
}
