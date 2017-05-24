package com.app.mapper;

import com.app.common.PageData;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 王立强 on 2017/5/19.
 */
@Mapper
public interface UserMapper {

    @Select(value = {"select * from user"})
    List<PageData> listAll();


    @Select(value = {"select * from user where id = #{id}"})
    PageData findOne(@Param("id") String id);

}
