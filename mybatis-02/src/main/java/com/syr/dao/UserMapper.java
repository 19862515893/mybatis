package com.syr.dao;

import com.syr.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author syr
 * @date 2022/2/14 - 21:37
 */
//接口类  操纵实体类的对象
public interface UserMapper {

    //查询全部用户
    List<User> getUserList();

    //根据Id查询用户
    User getUserById(int id);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}


/*
<!--namespace=绑定一个对应的dao/mapper接口 -->
<!--和userDao连接起来--><!--对象中的属性可以直接取出来-->
<!--configuration核心配置文件--><!--事务管理-->*/
