package com.syr.dao;

import com.syr.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author syr
 * @date 2022/2/14 - 21:37
 */
//接口类  操纵实体类的对象
public interface UserMapper {

    //根据Id查询用户
    User getUserById(int id);

    //分页
    List<User> getUserByLimit(HashMap<String, Integer> map);

    List<User> getUserByRowBounds();






}


