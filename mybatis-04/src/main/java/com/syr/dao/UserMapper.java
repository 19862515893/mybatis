package com.syr.dao;

import com.syr.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author syr
 * @date 2022/2/14 - 21:37
 */
//接口类  操纵实体类的对象
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    //方法存在多个参数，所有的参数前面必须加上@param注解
    /*@Select("select * from user where id = #{id} and name = #{name}")
    User getUserById(@Param("id") int id,@Param("name") String name);*/

    @Select("select * from user where name = #{name}")
    User getUserById(@Param("name") String name);

    //前面user括号里写数据库里的名字  value括号里写user类中的属性名
    @Insert("insert into user(id,name,pwd) value(#{id},#{name},#{pwd})")
    int addUser(User user);

    @Delete("delete from user where id = #{uid}")
    void deleteUser(@Param("uid") int id);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);
}


