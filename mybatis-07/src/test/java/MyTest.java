import com.syr.dao.BlogMapper;
import com.syr.pojo.Blog;
import com.syr.utils.IDutils;
import com.syr.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author syr
 * @date 2022/2/18 - 23:06
 */
public class MyTest {
    @Test
    public void addInitBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.close();
    }
    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title","Java如此简单2");
        map.put("author","狂神说");
        map.put("id","61967e0a8d174dc18705dd8f07db8eff");
       // map.put("views","9999");
        mapper.updateBlog(map);



        sqlSession.close();
    }
}
