package com.app.mapper;

import com.app.bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 王立强 on 2017/5/19.
 */
@Mapper
public interface UserMapper {

    @Select(value = {"select * from user"})
    @Results({@Result(column = "username", property = "username"), @Result(column = "age", property = "age")})
    List<Users> getAllUserInfo();

}
