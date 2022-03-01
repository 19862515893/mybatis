package com.syr.dao;

import com.syr.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author syr
 * @date 2022/2/18 - 22:46
 */
public interface BlogMapper {
    //插入数据

    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogchoose(Map map);

    //更新博客
    int updateBlog(Map map);
}
