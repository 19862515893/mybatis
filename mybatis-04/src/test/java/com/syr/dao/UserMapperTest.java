package com.syr.dao;

import com.syr.pojo.User;
import com.syr.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author syr
 * @date 2022/2/17 - 22:26
 */
public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById("狂神");
        System.out.println(userById);
        sqlSession.close();
    }
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(8, "宋亚茹", "111111"));
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(8);

        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(3,"yayou","1233"));
        sqlSession.close();
    }
}
