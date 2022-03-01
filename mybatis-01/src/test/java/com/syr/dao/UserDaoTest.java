package com.syr.dao;

import com.syr.pojo.User;
import com.syr.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author syr
 * @date 2022/2/14 - 22:06
 */
public class UserDaoTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("%宋%");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close();

    }
    
    @Test
    public void test(){
        //第一步：获得SqlSession对象 死的
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper
        UserMapper userdao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userdao.getUserList();

        for(User user:userList){
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void getUserById2(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("name","狂神");
        mapper.getUserById2(map);
        System.out.println(map);

        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        mapper.addUser(new User(11,"宋亚茹","213"));
        //int user = mapper.addUser(5,"宋亚茹","66666");


        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userid",7);
        map.put("userName","宋亚茹");
        map.put("password","1234");
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        mapper.updateUser(new User(5,"宋亚茹","123333"));
        //int user = mapper.addUser(5,"宋亚茹","66666");


        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        mapper.deleteUser(10);
        //int user = mapper.addUser(5,"宋亚茹","66666");


        sqlSession.commit();
        sqlSession.close();

    }
}
